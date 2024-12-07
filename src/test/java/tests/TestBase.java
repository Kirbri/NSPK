package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.MainPage;

import java.util.Map;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {
    final MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {

        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "126.0");
        browser = System.getProperty("browser", "chrome");
        Configuration.baseUrl = "https://nspk.ru";
        Configuration.timeout = 10000;
        Configuration.remote = "https://" + System.getProperty("login", "user1:1234") + "@"
                + System.getProperty("url", "selenoid.autotests.cloud") + "/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    void beforeEach() {
        step("Открытие главной страницы «Национальная система платежных карт»", () -> {
            open("/");
            mainPage.checkComplianceIndexHeadTitle();
        });

        step("Закрытие «cookie»", () -> {
            mainPage.closeCookies();
        });
    }

    @AfterEach
    void addAttachmentsAndCloseWebDriver() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        if (browser.equals("chrome")) {
            Attach.browserConsoleLogs();
        }
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}