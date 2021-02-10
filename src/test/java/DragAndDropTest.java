import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class DragAndDropTest extends BaseTest {
    SelenideElement blockA = $("#column-a");
    SelenideElement blockB = $("#column-b");

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        actions().clickAndHold(blockA).moveToElement(blockB).release().build().perform();
        blockA.shouldHave(text("B"));
        blockB.shouldHave(text("A"));

        /*blockA.dragAndDropTo(blockB);
        Selenide.sleep(3000);*/

        /*actions().dragAndDrop(blockA, blockB).perform();
        Selenide.sleep(3000);*/
    }
}
