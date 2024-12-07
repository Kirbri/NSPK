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

    final PressCenterPage pressCenterPage = new PressCenterPage();
    final MainPage mainPage = new MainPage();
    final ContactsPage contactsPage = new ContactsPage();
    final AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();
    final BanksPage banksPage = new BanksPage();
    final PaymentSystemMirPage paymentSystemMirPage = new PaymentSystemMirPage();
    final FastPaymentSystemPage fastPaymentSystemPage = new FastPaymentSystemPage();
    final UniversalQRPage universalQRPage = new UniversalQRPage();

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Правила и тарифы платежной системы «Мир», открытие pdf-файла Правила ПС «Мир». Приложение 4. Тарифы. Часть 1. Для российских участников (4.12)")
    void mainPageCardMIRDownloadFirstPDFFileTest() {
        step("Переход на страницу «Правила и тарифы платежной системы «Мир»", () -> {
            paymentSystemMirPage.openPaymentSystemMirPage();
        });
        step("Проверка данных в pdf-файле «Правила ПС «Мир». Приложение 4. Тарифы. Часть 1. Для российских участников (4.12)»", () -> {
            PDF pdf = new PDF(paymentSystemMirPage.downloadedPDF());
            paymentSystemMirPage.checkComplianceAssertionsPDF(pdf);
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Систему быстрых платежей, Подключи свой бизнес к СБП, открытие страницы Углеметбанка")
    void mainPageSBPConnectYourBisnesUglemetbankTest() {
        step("Переход на страницу «Система быстрых платежей»", () -> {
            fastPaymentSystemPage.openFastPaymentSystemPage();
        });
        step("Переход на страницу «Подключи свой бизнес к СБП»", () -> {
            fastPaymentSystemPage.openConnectYourBusinessToSBP();
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
            universalQRPage.checkKnowBenefitsBusinessButton()
                    .checkHowToConnect()
                    .checkHowToAcceptPaymentTapText()
                    .checkPaymentMethods();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы по всем страницам группы Банкам, проверка заголовков и содержания страниц")
    void pagesTabBanksTest() {
        step("Переход на страницу Банкам, Руководства", () -> {
            banksPage.checkComplianceOpenedBanksPageGuides();
        });
        step("Переход на страницу Банкам, Эквайринг SoftPOS", () -> {
            banksPage.checkComplianceOpenedBanksPageAcquiring();
        });
        step("Переход на страницу Банкам, Правила и тарифы платежной системы «Мир»", () -> {
            banksPage.checkComplianceOpenedBanksPageRules();
        });
        step("Переход на страницу Банкам, Сервис «Аналитика»", () -> {
            banksPage.checkComplianceOpenedBanksPageAnalytics();
        });
        step("Переход на страницу Банкам, Сервис привязки фискальных чеков к банковским транзакциям", () -> {
            banksPage.checkComplianceOpenedBanksPageEcheck();
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
            contactsPage.checkComplianceSidebarTitleText()
                    .checkComplianceContentFontInfoTexts()
                    .checkComplianceContentFontInfoSize();
        });
        step("Проверка изображений", () -> {
            contactsPage.checkComplianceSidebarImgAttribute();
        });
        step("Проверка ссылок", () -> {
            contactsPage.checkComplianceContactsFontHrefAddress()
                    .checkComplianceContactsFontHrefFax()
                    .checkComplianceContactsFontHrefSupportMir()
                    .checkComplianceContactsFontHrefEMail();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы на страницу группы О компании, Компания АО «НСПК», проверка содержания страницы")
    void aboutCompanyCheckTest() {
        step("Переход на страницу «О компании АО «НСПК»", () -> {
            aboutCompanyPage.openAboutCompanyPage();
        });
        step("Проверка текстового содержания на странице", () -> {
            aboutCompanyPage.checkComplianceAboutHeadHugeText()
                    .checkComplianceAboutHeadColsText()
                    .checkComplianceAboutHeadFontText()
                    .checkComplianceAboutMissionTitleText()
                    .checkComplianceAboutMissionFontHugeText()
                    .checkComplianceAboutMissionText0()
                    .checkComplianceAboutMissionText1();
        });
        step("Проверка изображений на странице»", () -> {
            aboutCompanyPage.checkComplianceAboutMissionImg0()
                    .checkComplianceAboutMissionImg1();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Проверка ссылок, телефонов, логотипа в 'подвале' сайта на главной странице")
    void mainPageFooterLinkTest() {
        step("Проверка изображений", () -> {
            mainPage.checkComplianceFooterLogoSvg();
        });
        step("Проверка текстового содержания", () -> {
            mainPage.checkComplianceFooterPhoneNumberNSPK()
                    .checkComplianceFooterPhoneNumberNSPKText()
                    .checkComplianceFooterPhoneNumberSupportMirSbp()
                    .checkComplianceFooterPhoneNumberSupportMirSbpText()
                    .checkComplianceFooterTextAllRightsReserved()
                    .checkComplianceFooterSocialNetworksMirText()
                    .checkComplianceFooterSocialNetworksSbpText();
        });
        step("Проверка ссылок", () -> {
            mainPage.checkComplianceFooterLogoHref()
                    .checkComplianceFooterPhoneNumberNSPKHref()
                    .checkComplianceFooterPhoneNumberSupportMirSbpHref()
                    .checkComplianceFooterSocialNetworksMirTgHref()
                    .checkComplianceFooterSocialNetworksMirVkHref()
                    .checkComplianceFooterSocialNetworksMirOkHref()
                    .checkComplianceFooterSocialNetworksSbpTgHref()
                    .checkComplianceFooterSocialNetworksSbpVkHref()
                    .checkComplianceFooterSocialNetworksSbpOkHref();
        });
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Переход с главной страницы на страницу Пресс-центр, проверка содержания pdf-файла Брендбук НСПК")
    void pressCenterDownloadPDFBrandBookNSPKTest() {
        step("Переход на страницу «Пресс-центр»", () -> {
            pressCenterPage.openPressCenterPage();
        });
        step("Проверка данных в pdf-файле «Брендбук НСПК»", () -> {
            PDF pdf = new PDF(pressCenterPage.downloadedPDF());
            pressCenterPage.complianceAssertionsPDF(pdf);
        });
    }
}