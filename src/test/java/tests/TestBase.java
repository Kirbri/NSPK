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

import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestBase {
    @BeforeAll
    static void beforeAll() {

        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "126.0");
        browser = System.getProperty("browser", "chrome");
//        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://nspk.ru";
        Configuration.timeout = 10000;

        Configuration.remote = "https://user1:1234@" + System.getProperty("url", "selenoid.autotests.cloud") + "/wd/hub";
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
        step("Открытие главной страницы", () -> {
            open("/");
            $(".ctr-index-head__font.ctr-index-head__font--title").shouldHave(text("Национальная " +
                    "система платежных карт"));
        });

        step("Закрытие «cookie»", () -> {
            $(".modals-cookies__button.modals-cookies__button--close.link").click();
        });
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        if (browser.equals("chrome")) {
            Attach.browserConsoleLogs();
        }
        Attach.addVideo();
    }
}
