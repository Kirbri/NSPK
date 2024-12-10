package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactsPage {

    private final SelenideElement hrefContacts = $("[href='/contacts']"),
            headFontTitle = $(".ctr-head__font.ctr-head__font--title"),
            sidebarTitle = $("#sidebar-176"),
            sidebarImg = $(".ctr-sidebar__img");

    private final ElementsCollection contentFontInfo = $$(".ui-html-content.ui-html-content--font"),
            contactsFontHref = $$("[rel='noopener noreferrer nofollow']");


    public ContactsPage openContactsPage() {
        hrefContacts.click();
        headFontTitle.should(text("Контакты"));
        return this;
    }

    public ContactsPage checkComplianceSidebarTitleText() {
        sidebarTitle.scrollTo().should(text("КАК СВЯЗАТЬСЯ"));
        return this;
    }

    public ContactsPage checkComplianceSidebarImgAttribute() {
        sidebarImg.scrollTo().should(attribute("src",
                "https://nspk.ru/storage/mediaicon/icon/0/0/90/90/Icon.png"));
        return this;
    }

    public ContactsPage checkComplianceContentFontInfoSize() {
        contentFontInfo.shouldHave(size(5));
        return this;
    }

    public ContactsPage checkComplianceContentFontInfoTexts() {
        contentFontInfo.shouldHave(texts("115184, Москва, ул. Большая Татарская, д. 11",
                "+7 495 705-99-99", "+7 495 705-99-77",
                "8 800 100 54 64\n(бесплатная линия для звонков по России)", "info@nspk.ru"));
        return this;
    }

    public ContactsPage checkComplianceContactsFontHrefAddress() {
        contactsFontHref.get(0).shouldHave(href("""
        https://yandex.ru/maps/213/moscow/house/bolshaya_tatarskaya_ulitsa_11/Z04YcARjQUEGQFtvfXt1cH1iYQ==/?ll=37.633841%2C55.741115&z=17.14"""));
        return this;
    }

    public ContactsPage checkComplianceContactsFontHrefFax() {
        contactsFontHref.get(2).shouldHave(href("tel:+7 (495) 705 99 77"));
        return this;
    }

    public ContactsPage checkComplianceContactsFontHrefSupportMir() {
        contactsFontHref.get(3).shouldHave(href("tel:8 800 100 54 64"));
        return this;
    }

    public ContactsPage checkComplianceContactsFontHrefEMail() {
        contactsFontHref.get(5).shouldHave(href("mailto:info@nspk.ru"));
        return this;
    }
}