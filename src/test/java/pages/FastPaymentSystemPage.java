package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FastPaymentSystemPage {
    private final SelenideElement connectYourBusinessToSBP = $("[href=\"/business/connect\"]"),
            uglemetbankLink = $("[src*=\"657083ca7d10c504436182.jpg\"]"),
            informationAOUglemetbank = $(".information .text");

    public FastPaymentSystemPage openFastPaymentSystemPage() {
        $("[href=\"https://sbp.nspk.ru/\"]").scrollTo().click();
        String newTabHandle = WebDriverRunner.getWebDriver().getWindowHandles().stream()
                .filter(handle -> !handle.equals(WebDriverRunner.getWebDriver().getWindowHandle()))
                .findFirst()
                .orElseThrow();
        switchTo().window(newTabHandle);
        $(".intro__font.intro__font--description").shouldHave(text("Оплачивайте покупки и переводите деньги через СБП!"));
        return this;
    }

    public FastPaymentSystemPage connectYourBusinessToSBP() {
        connectYourBusinessToSBP.scrollTo().click();
        return this;
    }

    public FastPaymentSystemPage openUglemetbankLink() {
        uglemetbankLink.scrollTo().click();
        for (String tab : WebDriverRunner.getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(tab);
        }
        informationAOUglemetbank.scrollTo().shouldHave(text("\n                © АО «Углеметбанк»."));
        return this;
    }
}
