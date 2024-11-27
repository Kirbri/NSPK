package tests;

import com.codeborne.pdftest.PDF;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

public class NspkTests extends TestBase {

    PressCenterPage pressCenterPage = new PressCenterPage();
    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();
    AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();
    BanksPage banksPage = new BanksPage();
    PaymentSystemMirPage paymentSystemMirPage = new PaymentSystemMirPage();
    FastPaymentSystemPage fastPaymentSystemPage = new FastPaymentSystemPage();
    UniversalQRPage universalQRPage = new UniversalQRPage();

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Правила и тарифы платежной системы «Мир», открытие " +
            "pdf-файла Правила ПС «Мир». Приложение 4. Тарифы. Часть 1. Для российских участников (4.12)")
    void mainPageCardMIRDownloadFirstPDFFileTest() throws Exception {
        step("Переход на страницу «Правила и тарифы платежной системы «Мир»", () -> {
            paymentSystemMirPage.openPaymentSystemMirPage();
        });
        step("Проверка данных в pdf-файле «Правила ПС «Мир». Приложение 4. Тарифы. Часть 1. Для российских " +
                "участников (4.12)»", () -> {
            PDF pdf = new PDF(paymentSystemMirPage.downloadedPDF());
            paymentSystemMirPage.complianceAssertionsPDF(pdf);
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Систему быстрых платежей, Подключи свой бизнес к СБП, " +
            "открытие страницы Углеметбанка")
    void mainPageSBPConnectYourBisnesUglemetbankTest() {
        step("Переход на страницу «Система быстрых платежей»", () -> {
            fastPaymentSystemPage.openFastPaymentSystemPage();
        });
        step("Переход на страницу «Подключи свой бизнес к СБП»", () -> {
            fastPaymentSystemPage.connectYourBusinessToSBP();
        });
        step("Переход на страницу подключения для банка «Углеметбанк»", () -> {
            fastPaymentSystemPage.openUglemetbankLink();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Универсальный QR, проверка содержания страницы")
    void mainPageUniversalQRTextTest() {
        step("Переход на страницу «Универсальный QR»", () -> {
            universalQRPage.openPaymentSystemMirPage();
        });
        step("Проверка текстового содержания на странице", () -> {
            universalQRPage.knowBenefitsBusinessButton()
                    .howToConnect()
                    .howToAcceptPaymentTapText()
                    .paymentMethods();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы по всем страницам группы Банкам, проверка заголовков и содержания страниц")
    void pagesTabBanksTest() {
        step("Переход на страницу Банкам, Руководства", () -> {
            banksPage.complianceOpenedBanksPageGuides();
        });
        step("Переход на страницу Банкам, Эквайринг SoftPOS", () -> {
            banksPage.complianceOpenedBanksPageAcquiring();
        });
        step("Переход на страницу Банкам, Правила и тарифы платежной системы «Мир»", () -> {
            banksPage.complianceOpenedBanksPageRules();
        });
        step("Переход на страницу Банкам, Сервис «Аналитика»", () -> {
            banksPage.complianceOpenedBanksPageAnalytics();
        });
        step("Переход на страницу Банкам, Сервис привязки фискальных чеков к банковским транзакциям", () -> {
            banksPage.complianceOpenedBanksPageEcheck();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы на страницу Контакты, проверка содержания страницы")
    void contactsCheckTest() {
        step("Переход на страницу «Контакты»", () -> {
            contactsPage.openContactsPage();
        });
        step("Проверка текстового содержания на странице и количества элементов", () -> {
            contactsPage.complianceSidebarTitleText()
                    .complianceContentFontInfoTexts()
                    .complianceContentFontInfoSize();
        });
        step("Проверка изображений", () -> {
            contactsPage.complianceSidebarImgAttribute();
        });
        step("Проверка ссылок", () -> {
            contactsPage.complianceContactsFontHrefAddress()
                    .complianceContactsFontHrefFax()
                    .complianceContactsFontHrefSupportMir()
                    .complianceContactsFontHrefEMail();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы на страницу группы О компании, Компания АО «НСПК», проверка содержания " +
            "страницы")
    void aboutCompanyCheckTest() {
        step("Переход на страницу «О компании АО «НСПК»", () -> {
            aboutCompanyPage.openAboutCompanyPage();
        });
        step("Проверка текстового содержания на странице", () -> {
            aboutCompanyPage.complianceAboutHeadHugeText()
                    .complianceAboutHeadColsText()
                    .complianceAboutHeadFontText()
                    .complianceAboutMissionTitleText()
                    .complianceAboutMissionFontHugeText()
                    .complianceAboutMissionText0()
                    .complianceAboutMissionText1();
        });
        step("Проверка изображений на странице»", () -> {
            aboutCompanyPage.complianceAboutMissionImg0()
                    .complianceAboutMissionImg1();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Проверка ссылок, телефонов, логотипа в \"подвале\" сайта на главной странице")
    void mainPageFooterLinkTest() {
        step("Проверка изображений", () -> {
            mainPage.complianceFooterLogoSvg();
        });
        step("Проверка текстового содержания", () -> {
            mainPage.complianceFooterPhoneNumberNSPK()
                    .complianceFooterPhoneNumberNSPKText()
                    .complianceFooterPhoneNumberSupportMirSbp()
                    .complianceFooterPhoneNumberSupportMirSbpText()
                    .complianceFooterTextAllRightsReserved()
                    .complianceFooterSocialNetworksMirText()
                    .complianceFooterSocialNetworksSbpText();
        });
        step("Проверка ссылок", () -> {
            mainPage.complianceFooterLogoHref()
                    .complianceFooterPhoneNumberNSPKHref()
                    .complianceFooterPhoneNumberSupportMirSbpHref()
                    .complianceFooterSocialNetworksMirTgHref()
                    .complianceFooterSocialNetworksMirVkHref()
                    .complianceFooterSocialNetworksMirOkHref()
                    .complianceFooterSocialNetworksSbpTgHref()
                    .complianceFooterSocialNetworksSbpVkHref()
                    .complianceFooterSocialNetworksSbpOkHref();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Переход с главной страницы на страницу Пресс-центр, проверка содержания pdf-файла Брендбук НСПК")
    void pressCenterDownloadPDFBrandBookNSPKTest() throws Exception {
        step("Переход на страницу «Пресс-центр»", () -> {
            pressCenterPage.openPressCenterPage();
        });
        step("Проверка данных в pdf-файле «Брендбук НСПК»", () -> {
            PDF pdf = new PDF(pressCenterPage.downloadedPDF());
            pressCenterPage.complianceAssertionsPDF(pdf);
        });
    }
}