package pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PressCenterPage {
    private final SelenideElement dataMenuPressCenter = $("[data-menu-name='pressCenter']"),
            headFontTitle = $(".ctr-head__font.ctr-head__font--title"),
            pdfNSPKBrandBook = $(".bundles-list__links.hidden-mobile [href='/file/8bfdff31/671b99cd24b09348972373.pdf']");
    private final int numberOfPagesNSPKBrandBook = 55;
    private final int creationDateYearNSPKBrandBook = 2022;
    private final String creatorNSPKBrandBook = "Adobe InDesign 17.0 (Windows)";

    public PressCenterPage openPressCenterPage() {
        dataMenuPressCenter.click();
        headFontTitle.shouldHave(text("Пресс-центр"));
        return this;
    }

    public File downloadedPDF() {
        return pdfNSPKBrandBook.scrollTo().download();
    }

    public PressCenterPage complianceAssertionsPDF(PDF pdfFile) {
        Assertions.assertEquals(pdfFile.numberOfPages, numberOfPagesNSPKBrandBook);
        Assertions.assertEquals(pdfFile.creationDate.getWeekYear(), creationDateYearNSPKBrandBook);
        Assertions.assertEquals(pdfFile.creator, creatorNSPKBrandBook);
        return this;
    }
}