package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HorizontalSliderTest extends BaseTests {


    @Test
    public void HorizontalSliderTests() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveToTheRight("4");
        assertEquals(horizontalSliderPage.getResults(), "4");

        horizontalSliderPage.moveToTheLeft("0");
        assertEquals(horizontalSliderPage.getResults(), "0");

    }
}
