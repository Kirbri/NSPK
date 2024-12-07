package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BanksPage {
    private final SelenideElement banksMenuPage = $("[data-menu-name='banks']"),
            guidesBanksMenuPage = $("[href='/banks/guides']"),
            acquiringBanksMenuPage = $("[href='/banks/acquiring']"),
            rulesBanksMenuPage = $("[href='/banks/rules']"),
            analyticsBanksMenuPage = $("[href='/banks/analytics']"),
            echeckBanksMenuPage = $("[href='/echeck']"),
            scrollTab = $(".scroll-smooth"),
            guidesHeadFontTitleText = $(".ctr-head__font.ctr-head__font--title"),
            acquiringHeadFontText = $(".ctr-head__font.ctr-head__font--text"),
            analyticsHeadFontTitle = $(".ctr-analytics-head__font.ctr-analytics-head__font--title"),
            analyticsHeadFontText = $(".ctr-analytics-head__font.ctr-analytics-head__font--text"),
            echeckHeadFontTitle = $(".ctr-check-head__font.ctr-check-head__font--title"),
            echeckHeadFontText = $(".ctr-check-head__font.ctr-check-head__font--text");

    private final ElementsCollection guidesSidebarFontTitleYears = $$(".ctr-sidebar__font.ctr-sidebar__font--title"),
            rulesLinkFontText = $$(".ui-file-link__font.ui-file-link__font--text");

    public BanksPage checkComplianceOpenedBanksPageGuides() {
        banksMenuPage.hover();
        guidesBanksMenuPage.click();
        guidesHeadFontTitleText.should(text("Руководства"));
        guidesSidebarFontTitleYears.shouldHave(texts("2024", "2022", "2016", "2015"));
        return this;
    }

    public BanksPage checkComplianceOpenedBanksPageAcquiring() {
        scrollTab.scrollTo();
        banksMenuPage.hover();
        acquiringBanksMenuPage.click();
        guidesHeadFontTitleText.should(text("Эквайринг SoftPOS"));
        acquiringHeadFontText.should(text("Прием оплаты за товары и услуги в торговых предприятиях с помощью смартфона без использования специального дополнительного оборудования."));
        return this;
    }

    public BanksPage checkComplianceOpenedBanksPageRules() {
        scrollTab.scrollTo();
        banksMenuPage.hover();
        rulesBanksMenuPage.click();
        guidesHeadFontTitleText.should(text("Правила и тарифы платежной системы «Мир»"));
        rulesLinkFontText.should(texts("Стандарт ПС «Мир». Межбанковские вознаграждения в ПС «Мир» (2.3)",
                "Правила ПС «Мир». Приложение 4. Тарифы. Часть 2. Для иностранных (нероссийских) участников (4.7)",
                "Правила ПС «Мир». Приложение 4. Тарифы. Часть 1. Для российских участников (4.12)",
                "Лист самооценки (SAQ D-MIR) на русском языке версия 2.0",
                "Правила ПС «Мир» (4.2)",
                "Правила ПС «Мир». Приложение 1. Термины и определения (4.1)",
                "Правила ПС «Мир». Приложение 2. Форма заявления на присоединение к Правилам (3.5)",
                "Правила ПС «Мир». Приложение 3. Методика определения размера гарантийного взноса Участника (4.0)"));
        return this;
    }

    public BanksPage checkComplianceOpenedBanksPageAnalytics() {
        scrollTab.scrollTo();
        banksMenuPage.hover();
        analyticsBanksMenuPage.click();
        analyticsHeadFontTitle.should(text("Сервис «Аналитика»"));
        analyticsHeadFontText.scrollTo().should(text("Предоставляет российским участникам ПС «Мир» готовые аналитические бизнес-отчеты, которые позволяют оценить собственные показатели банка в различных разрезах и сравнить их с рынком."));
        return this;
    }

    public BanksPage checkComplianceOpenedBanksPageEcheck() {
        scrollTab.scrollTo();
        banksMenuPage.hover();
        echeckBanksMenuPage.click();
        echeckHeadFontTitle.should(text("Сервис привязки фискальных чеков к банковским транзакциям"));
        echeckHeadFontText.scrollTo().should(text("Это удобный и быстрый инструмент получения в электронном виде кассового чека клиента по покупкам"));
        return this;
    }
}