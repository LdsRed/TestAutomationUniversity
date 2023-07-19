package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class FrameTests extends BaseTests {

    @Test
    public void testFrame(){
        var frameTestPage = homePage.clickNestedFramePage();
        String textLeftFrame = frameTestPage.getTextFromLeftFrame();
        String textBottomFrame = frameTestPage.getTextFromBottomFrame();
        assertEquals(textLeftFrame, "LEFT", "Left text is incorrect");

        assertEquals(textBottomFrame, "BOTTOM", "Bottom text is incorrect");
    }
}
