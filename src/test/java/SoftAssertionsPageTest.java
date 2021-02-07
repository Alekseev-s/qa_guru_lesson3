import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsPageTest extends BaseTest {
    @Test
    void shouldHaveJunit5Example() {
        open("https://github.com/selenide/selenide");
        $("span[data-content='Wiki']").click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(withText("Using JUnit5")).closest("ol").$x(".//following-sibling::div/pre").shouldBe(Condition.visible);
    }
}
