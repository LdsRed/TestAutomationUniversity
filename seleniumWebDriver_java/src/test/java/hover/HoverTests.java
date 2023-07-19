package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class HoverTests extends BaseTests {



    @Test
    public void testHoverUser1()
    {


        var hoversPage = homePage.clickHovers();
        var captions = hoversPage.hoverOverFigure(1);

        assertTrue(captions.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(captions.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(captions.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(captions.getLink().endsWith("/users/1"), "Link incorrect");
    }

}
