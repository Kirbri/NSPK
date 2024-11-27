package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement footerLogoSvg = $(".layout-footer__logo"),
            footerLogoHref = $(".router-link-active.router-link-exact-active.layout-footer__link.layout-footer__" +
                    "link--logo"),
            phoneNumberNSPK = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--phone", 0),
            phoneNumberNSPKHref = $(".layout-footer__contacts .layout-footer__phone.link", 0),
            phoneNumberNSPKText = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--text",
                    0),
            phoneNumberSupportMirSbp = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--phone",
                    1),
            phoneNumberSupportMirSbpHref = $(".layout-footer__contacts .layout-footer__phone.link", 1),
            phoneNumberSupportMirSbpText = $(".layout-footer__contacts .layout-footer__font.layout-footer__font--text",
                    1),
            footerTextAllRightsReserved = $(".layout-footer__section.layout-footer__section--bottom"),
            footerSocialNetworksMirText = $(".layout-footer__font.layout-footer__font--socials.hidden-mobile",
                    0),
            footerSocialNetworksSbpText = $(".layout-footer__font.layout-footer__font--socials.hidden-mobile",
                    1),
            footerSocialNetworksMirTgHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link" +
                    "--social.link", 0),
            footerSocialNetworksMirVkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link" +
                    "--social.link", 1),
            footerSocialNetworksMirOkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link" +
                    "--social.link", 2),
            footerSocialNetworksSbpTgHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link" +
                    "--social.link", 3),
            footerSocialNetworksSbpVkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link" +
                    "--social.link", 4),
            footerSocialNetworksSbpOkHref = $(".layout-footer__icons .layout-footer__link.layout-footer__link" +
                    "--social.link", 5);

    public MainPage complianceFooterLogoSvg() {
        footerLogoSvg.scrollTo().should(attribute("src",
                "https://nspk.ru/images/logo.svg"));
        return this;
    }

    public MainPage complianceFooterLogoHref() {
        footerLogoHref.scrollTo().should(attribute("href", "https://nspk.ru/"));
        return this;
    }

    public MainPage complianceFooterPhoneNumberNSPK() {
        phoneNumberNSPK.scrollTo().should(text("8 495 705 9999"));
        return this;
    }

    public MainPage complianceFooterPhoneNumberNSPKHref() {
        phoneNumberNSPKHref.scrollTo().should(attribute("href", "tel:8 495 705 9999"));
        return this;
    }

    public MainPage complianceFooterPhoneNumberNSPKText() {
        phoneNumberNSPKText.scrollTo().should(text("АО «НСПК»"));
        return this;
    }

    public MainPage complianceFooterPhoneNumberSupportMirSbp() {
        phoneNumberSupportMirSbp.scrollTo().should(text("8 800 100 5464"));
        return this;
    }

    public MainPage complianceFooterPhoneNumberSupportMirSbpHref() {
        phoneNumberSupportMirSbpHref.scrollTo().should(attribute("href",
                "tel:8 800 100 5464"));
        return this;
    }

    public MainPage complianceFooterPhoneNumberSupportMirSbpText() {
        phoneNumberSupportMirSbpText.scrollTo().should(text("Поддержка держателей карт «Мир» и клиентов Системы " +
                "быстрых платежей"));
        return this;
    }

    public MainPage complianceFooterTextAllRightsReserved() {
        footerTextAllRightsReserved.scrollTo().should(text("© 2024 НСПК. Все права защищены"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksMirText() {
        footerSocialNetworksMirText.scrollTo().should(text("МИР"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksSbpText() {
        footerSocialNetworksSbpText.scrollTo().should(text("СБП"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksMirTgHref() {
        footerSocialNetworksMirTgHref.scrollTo().should(attribute("href",
                "https://t.me/promomir"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksMirVkHref() {
        footerSocialNetworksMirVkHref.scrollTo().should(attribute("href",
                "https://vk.com/mirpaycard"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksMirOkHref() {
        footerSocialNetworksMirOkHref.scrollTo().should(attribute("href",
                "https://ok.ru/mirpaycard"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksSbpTgHref() {
        footerSocialNetworksSbpTgHref.scrollTo().should(attribute("href",
                "https://t.me/sbp_pay"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksSbpVkHref() {
        footerSocialNetworksSbpVkHref.scrollTo().should(attribute("href",
                "https://vk.com/sbp"));
        return this;
    }

    public MainPage complianceFooterSocialNetworksSbpOkHref() {
        footerSocialNetworksSbpOkHref.scrollTo().should(attribute("href",
                "https://ok.ru/sbp"));
        return this;
    }
}