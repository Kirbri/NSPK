package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement indexHeadTitle = $(".ctr-index-head__font.ctr-index-head__font--title"),
            cookiesModalsButtonClose = $(".modals-cookies__button.modals-cookies__button--close.link"),
            footerLogoSvg = $(".layout-footer__logo"),
            footerLogoHref = $(".router-link-active.router-link-exact-active.layout-footer__link.layout-footer__link--logo"),
            phoneNumberNSPK = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--phone", 0),
            phoneNumberNSPKHref = $(".layout-footer__contacts .layout-footer__phone.link", 0),
            phoneNumberNSPKText = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--text", 0),
            phoneNumberSupportMirSbp = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--phone", 1),
            phoneNumberSupportMirSbpHref = $(".layout-footer__contacts .layout-footer__phone.link", 1),
            phoneNumberSupportMirSbpText = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--text", 1),
            footerTextAllRightsReserved = $(".layout-footer__section.layout-footer__section--bottom"),
            footerSocialNetworksMirText = $(".layout-footer__font.layout-footer__font--socials.hidden-mobile", 0),
            footerSocialNetworksSbpText = $(".layout-footer__font.layout-footer__font--socials.hidden-mobile", 1),
            footerSocialNetworksMirTgHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link--social.link", 0),
            footerSocialNetworksMirVkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link--social.link", 1),
            footerSocialNetworksMirOkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link--social.link", 2),
            footerSocialNetworksSbpTgHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link--social.link", 3),
            footerSocialNetworksSbpVkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link--social.link", 4),
            footerSocialNetworksSbpOkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link--social.link", 5);

    public MainPage closeCookies() {
        cookiesModalsButtonClose.click();
        return this;
    }

    public MainPage checkComplianceIndexHeadTitle() {
        indexHeadTitle.shouldHave(text("Национальная система платежных карт"));
        return this;
    }

    public MainPage checkComplianceFooterLogoSvg() {
        footerLogoSvg.scrollTo().should(attribute("src",
                "https://nspk.ru/images/logo.svg"));
        return this;
    }

    public MainPage checkComplianceFooterLogoHref() {
        footerLogoHref.scrollTo().should(attribute("href", "https://nspk.ru/"));
        return this;
    }

    public MainPage checkComplianceFooterPhoneNumberNSPK() {
        phoneNumberNSPK.scrollTo().should(text("8 495 705 9999"));
        return this;
    }

    public MainPage checkComplianceFooterPhoneNumberNSPKHref() {
        phoneNumberNSPKHref.scrollTo().should(attribute("href", "tel:8 495 705 9999"));
        return this;
    }

    public MainPage checkComplianceFooterPhoneNumberNSPKText() {
        phoneNumberNSPKText.scrollTo().should(text("АО «НСПК»"));
        return this;
    }

    public MainPage checkComplianceFooterPhoneNumberSupportMirSbp() {
        phoneNumberSupportMirSbp.scrollTo().should(text("8 800 100 5464"));
        return this;
    }

    public MainPage checkComplianceFooterPhoneNumberSupportMirSbpHref() {
        phoneNumberSupportMirSbpHref.scrollTo().should(attribute("href",
                "tel:8 800 100 5464"));
        return this;
    }

    public MainPage checkComplianceFooterPhoneNumberSupportMirSbpText() {
        phoneNumberSupportMirSbpText.scrollTo().should(text("Поддержка держателей карт «Мир» и клиентов Системы быстрых платежей"));
        return this;
    }

    public MainPage checkComplianceFooterTextAllRightsReserved() {
        footerTextAllRightsReserved.scrollTo().should(text("© 2024 НСПК. Все права защищены"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksMirText() {
        footerSocialNetworksMirText.scrollTo().should(text("МИР"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksSbpText() {
        footerSocialNetworksSbpText.scrollTo().should(text("СБП"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksMirTgHref() {
        footerSocialNetworksMirTgHref.scrollTo().should(attribute("href",
                "https://t.me/promomir"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksMirVkHref() {
        footerSocialNetworksMirVkHref.scrollTo().should(attribute("href",
                "https://vk.com/mirpaycard"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksMirOkHref() {
        footerSocialNetworksMirOkHref.scrollTo().should(attribute("href",
                "https://ok.ru/mirpaycard"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksSbpTgHref() {
        footerSocialNetworksSbpTgHref.scrollTo().should(attribute("href",
                "https://t.me/sbp_pay"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksSbpVkHref() {
        footerSocialNetworksSbpVkHref.scrollTo().should(attribute("href",
                "https://vk.com/sbp"));
        return this;
    }

    public MainPage checkComplianceFooterSocialNetworksSbpOkHref() {
        footerSocialNetworksSbpOkHref.scrollTo().should(attribute("href",
                "https://ok.ru/sbp"));
        return this;
    }
}