package tests;

import com.codeborne.pdftest.PDF;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

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
    @DisplayName("Переход с главной страницы по ссылке на Правила и тарифы платежной системы «Мир», открытие pdf-файла " +
            "Правила ПС «Мир». Приложение 4. Тарифы. Часть 1. Для российских участников (4.12)")
    void mainPageCardMIRDownloadFirstPDFFileTest() throws Exception {
        paymentSystemMirPage.openPaymentSystemMirPage();
        PDF pdf = new PDF(paymentSystemMirPage.downloadedPDF());
        paymentSystemMirPage.complianceAssertionsPDF(pdf);
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Систему быстрых платежей, Подключи свой бизнес к СБП, " +
            "открытие страницы Углеметбанка")
    void mainPageSBPConnectYourBisnesUglemetbankTest() {
        fastPaymentSystemPage.openFastPaymentSystemPage()
                .connectYourBusinessToSBP()
                .openUglemetbankLink();
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход с главной страницы по ссылке на Универсальный QR, проверка содержания страницы")
    void mainPageUniversalQRTextTest() {
        universalQRPage.openPaymentSystemMirPage()
                .knowBenefitsBusinessButton()
                .howToConnect()
                .howToAcceptPaymentTapText()
                .paymentMethods();
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы по всем страницам группы Банкам, проверка заголовков и содержания страниц")
    void pagesTabBanksTest() {
        banksPage.complianceOpenedBanksPageGuides()
                .complianceOpenedBanksPageAcquiring()
                .complianceOpenedBanksPageRules()
                .complianceOpenedBanksPageAnalytics()
                .complianceOpenedBanksPageEcheck();
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы на страницу Контакты, проверка содержания страницы")
    void contactsCheckTest() {
        contactsPage.openContactsPage()
                .complianceSidebarTitleText()
                .complianceSidebarImgAttribute()
                .complianceContentFontInfoSize()
                .complianceContentFontInfoTexts()
                .complianceContactsFontHrefAddress()
                .complianceContactsFontHrefFax()
                .complianceContactsFontHrefSupportMir()
                .complianceContactsFontHrefEMail();
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход с главной страницы на страницу группы О компании, Компания АО «НСПК», проверка содержания " +
            "страницы")
    void aboutCompanyCheckTest() {
        aboutCompanyPage.openAboutCompanyPage()
                .complianceAboutHeadHugeText()
                .complianceAboutHeadColsText()
                .complianceAboutHeadFontText()
                .complianceAboutMissionTitleText()
                .complianceAboutMissionImg0()
                .complianceAboutMissionFontHugeText()
                .complianceAboutMissionText0()
                .complianceAboutMissionImg1()
                .complianceAboutMissionText1();
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Проверка ссылок, телефонов, логотипа в \"подвале\" сайта на главной странице")
    void mainPageFooterLinkTest() {
        mainPage.complianceFooterLogoSvg()
                .complianceFooterLogoHref()
                .complianceFooterPhoneNumberNSPK()
                .complianceFooterPhoneNumberNSPKHref()
                .complianceFooterPhoneNumberNSPKText()
                .complianceFooterPhoneNumberSupportMirSbp()
                .complianceFooterPhoneNumberSupportMirSbpHref()
                .complianceFooterPhoneNumberSupportMirSbpText()
                .complianceFooterTextAllRightsReserved()
                .complianceFooterSocialNetworksMirText()
                .complianceFooterSocialNetworksSbpText()
                .complianceFooterSocialNetworksMirTg()
                .complianceFooterSocialNetworksMirVkHref()
                .complianceFooterSocialNetworksMirOkHref()
                .complianceFooterSocialNetworksSbpTg()
                .complianceFooterSocialNetworksSbpVkHref()
                .complianceFooterSocialNetworksSbpOkHref();
    }

    @Test
    @Tag("SMOKE")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Переход с главной страницы на страницу Пресс-центр, проверка содержания pdf-файла Брендбук НСПК")
    void pressCenterDownloadPDFBrandBookNSPKTest() throws Exception {
        pressCenterPage.openPressCenterPage();
        PDF pdf = new PDF(pressCenterPage.downloadedPDF());
        pressCenterPage.complianceAssertionsPDF(pdf);
    }
}