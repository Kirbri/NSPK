package pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class PaymentSystemMirPage {
    private final SelenideElement hrefTermsAndTariffs = $("[href='https://www.nspk.ru/cards-mir/terms-and-tariffs']"),
            headFontTitle = $(".ctr-head__font.ctr-head__font--title"),
            pdfRulesPSMir = $("[href='/file/fff98849/tarify-rus-4-12.pdf']");
    private final int numberOfPagesPdfRulesPSMir = 40;
    private final String authorPdfRulesPSMir = "Ожерельева Ольга Викторовна";
    private final String titlePdfRulesPSMir = "Правила платежной системы «Мир». Приложение 4. Тарифы. Часть 1. Для Российских участников_v.4.12";

    public PaymentSystemMirPage openPaymentSystemMirPage() {
        hrefTermsAndTariffs.scrollTo().click();
        String newTabHandle = WebDriverRunner.getWebDriver().getWindowHandles().stream()
                .filter(handle -> !handle.equals(WebDriverRunner.getWebDriver().getWindowHandle()))
                .findFirst()
                .orElseThrow();
        switchTo().window(newTabHandle);
        headFontTitle.shouldHave(text("Правила и тарифы платежной системы «Мир»"));
        return this;
    }

    public File downloadedPDF() {
        return pdfRulesPSMir.scrollTo().download();
    }

    public PaymentSystemMirPage checkComplianceAssertionsPDF(PDF pdfFile) {
        Assertions.assertEquals(pdfFile.author, authorPdfRulesPSMir);
        Assertions.assertEquals(pdfFile.title, titlePdfRulesPSMir);
        Assertions.assertEquals(pdfFile.numberOfPages, numberOfPagesPdfRulesPSMir);
        return this;
    }
}