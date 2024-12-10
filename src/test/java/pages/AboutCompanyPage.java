package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutCompanyPage {

    private final SelenideElement dataMenuName = $("[data-menu-name='about']"),
            aboutCompany = $("[href='/about/company']"),
            aboutHeadTitle = $(".ctr-about-head__font.ctr-about-head__font--title"),
            aboutHeadHuge = $(".ui-html-content.ctr-about-head__font.ctr-about-head__font--huge"),
            aboutHeadCols = $(".ui-grid-columns-base.ui-grid-columns-base--23.ctr-about-head__cols .ctr-about-head__font.ctr-about-head__font--text"),
            aboutHeadFontText = $(".ui-grid-columns-base.ui-grid-columns-base--23.ctr-about-head__cols .ctr-about-head__tiny"),
            aboutMissionTitle = $(".ctr-about-mission__font.ctr-about-mission__font--title"),
            aboutMissionImg0 = $(".ctr-about-mission__img", 0),
            aboutMissionFontHuge = $(".ctr-about-mission__font.ctr-about-mission__font--huge"),
            aboutMissionText0 = $(".ctr-about-mission__text .ctr-about-mission__font.ctr-about-mission__font--text", 0),
            aboutMissionImg1 = $(".ctr-about-mission__img", 1),
            aboutMissionText1 = $(".ctr-about-mission__text .ctr-about-mission__font.ctr-about-mission__font--text", 1);

    public AboutCompanyPage openAboutCompanyPage() {
        dataMenuName.hover();
        aboutCompany.click();
        aboutHeadTitle.scrollTo().should(text("О компании АО «НСПК»"));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutHeadHugeText() {

        aboutHeadHuge.scrollTo().should(text("""
        Акционерное общество «Национальная система платежных карт» (НСПК) — оператор платежной системы «Мир»,
         операционный платежный и клиринговый центр Системы быстрых платежей (СБП), создано 23 июля 2014 года. 100%
         акций АО «НСПК» принадлежит Центральному банку Российской Федерации"""));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutHeadColsText() {

        aboutHeadCols.scrollTo().should(text("""
        Развитие национальной платежной системы — ключевой фактор обеспечения суверенитета национального платежного
         пространства. Национальная платежная система гарантирует безопасность и бесперебойность проведения
         внутрироссийских транзакций по банковским картам."""));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutHeadFontText() {
        aboutHeadFontText.scrollTo().should(text("""
        Деятельность НСПК регулируется Федеральным законом № 161 «О национальной платежной системе», «Стратегией
         развития Национальной платежной системы» и «Концепцией создания национальной системы платежных карт»."""));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutMissionTitleText() {
        aboutMissionTitle.scrollTo().should(text("МИССИЯ КОМПАНИИ"));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutMissionImg0() {
        aboutMissionImg0.scrollTo().should(attribute("src",
                "https://nspk.ru/storage/mediaicon/icon/0/0/61/61/Gerb.png"));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutMissionFontHugeText() {
        aboutMissionFontHuge.scrollTo().should(text("""
        Для всех жителей России и для государства создаем и развиваем доступные, удобные и выгодные платежные сервисы,
         поддерживая суверенитет страны и формируя стандарты индустрии"""));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutMissionText0() {
        aboutMissionText0.scrollTo().should(text("""
        В задачи НСПК входят обеспечение бесперебойности операций по картам международных платежных систем на
         территории России, построение и развитие российской системы платежных карт, а также обеспечение удобных и
         безопасных операций через Систему быстрых платежей (СБП), по универсальному QR-коду и с помощью биоэквайринга
         на территории страны."""));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutMissionImg1() {
        aboutMissionImg1.scrollTo().should(attribute("src",
                "https://nspk.ru/storage/mediaicon/icon/0/0/62/62/test%204.png"));
        return this;
    }

    public AboutCompanyPage checkComplianceAboutMissionText1() {
        aboutMissionText1.scrollTo().should(text("""
        Внутрироссийские операции по картам всех платежных систем, в том числе международных, после 1 апреля 2015
         года осуществляются через процессинг операционного платежного и клирингового центра НСПК (ОПКЦ НСПК)."""));
        return this;
    }
}