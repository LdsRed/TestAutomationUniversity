package dynamicLoading;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Load text incorrect");


    }

    @Test
    public void testFluenWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample2();
        loadingPage.clickStar2();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Load text incorrect");
    }
}
