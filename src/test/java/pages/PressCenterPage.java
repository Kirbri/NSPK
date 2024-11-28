package pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

//Вопросы - что сделать с полями пдф - убрать в отдельный класс или оставить полями с геттерами, нужно ли вынести
// Assertions в этот класс
public class PressCenterPage extends Exception {
    private final SelenideElement pdfNSPKBrandBook = $(".bundles-list__links.hidden-mobile " +
            "[href=\"/file/8bfdff31/671b99cd24b09348972373.pdf\"]");
    private final int numberOfPagesNSPKBrandBook = 55;
    private final int creationDateYearNSPKBrandBook = 2022;
    private final String creatorNSPKBrandBook = "Adobe InDesign 17.0 (Windows)";
    private final String partTextNSPKBrandBook = "Версия 1.0\r\nРуководство \r\nпо использованию \r\nфирменного стиля";

    public PressCenterPage openPressCenterPage() {
        $("[data-menu-name=\"pressCenter\"]").click();
        $(".ctr-head__font.ctr-head__font--title").shouldHave(text("Пресс-центр"));
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
