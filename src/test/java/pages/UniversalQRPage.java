package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class UniversalQRPage {
    private final SelenideElement knowBenefitsButton= $(".uniqr-main__font.uniqr-main__font--button"),
    advantagesHeadingText = $(".advantages__font.advantages__font--heading"),
    linksPagesBusiness = $("[href=\"/uniqr/business\"]"),
    advantagesTitleText = $(".advantages__font.advantages__font--title"),
    howToConnectText = $(".connection__font.connection__font--heading"),
    howAcceptPaymentText = $(".how__font.how__font--heading"),
    howStepsText = $(".how__text .html-content.how__font.how__font--text"),
    steps2IconLink = $("[viewBox=\"0 0 33 46\"]"),
    steps3IconLink = $("[viewBox=\"0 0 30 47\"]"),
    steps4IconLink = $("[viewBox=\"0 0 30 45\"]"),
    uniqrCardsTitle = $(".uniqr-cards__font.uniqr-cards__font--title");

    private final ElementsCollection connectionSliderSize = $$(".connection__item"),
    cardTitleSize = $$(".cards-uniqr-card__font.cards-uniqr-card__font--title");

    public UniversalQRPage openPaymentSystemMirPage() {
        $("[href=\"https://sbp.nspk.ru/uniqr?utm_source=nspkru\"]").scrollTo().click();
        for (String tab : WebDriverRunner.getWebDriver().getWindowHandles()) {
            Selenide.switchTo().window(tab);
        }
        $(".uniqr-main__title").should(text("Оплачивайте покупки и принимайте оплату по Универсальному QR"));
        return this;
    }

    public UniversalQRPage knowBenefitsBusinessButton () {
        knowBenefitsButton.click();
        linksPagesBusiness.click();
        advantagesHeadingText.scrollIntoView(true).should(text("Преимущества Универсального QR"));
        advantagesTitleText.scrollIntoView(true).should(text("Все доступные способы оплаты в одном QR"));
        return this;
    }

    public UniversalQRPage howToConnect () {
        howToConnectText.scrollTo().should(text("Как подключиться"));
        connectionSliderSize.shouldHave(size(3));
        return this;
    }

    public UniversalQRPage howToAcceptPaymentTapText () {
        howAcceptPaymentText.scrollTo().should(text("Как принимать оплату"));
        howStepsText.should(text("Продавец демонстрирует Универсальный QR клиенту на любом удобном носителе"));
        steps2IconLink.click();
        howStepsText.should(text("Клиент считывает Универсальный QR: либо камерой смартфона, либо камерой " +
                "платежного приложения"));
        steps3IconLink.click();
        howStepsText.should(text("Клиент выбирает удобный для себя способ оплаты из числа тех, которые " +
                "поддерживаются продавцом, и платежное приложение"));
        steps4IconLink.click();
        howStepsText.should(text("Клиент подтверждает оплату. Денежные средства поступают на счет продавца в " +
                "соответствии с договором между ним и тем платежным сервисом, с использованием которого выполнен " +
                "платеж"));
        return this;
    }

    public UniversalQRPage paymentMethods () {
        uniqrCardsTitle.scrollTo().should(text("Способы приема оплаты по QR коду"));
        cardTitleSize.shouldHave(size(4));
        return this;
    }
}