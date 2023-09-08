package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goFoward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchTab2() {
        homePage.clickDynamicLoadingPage().clickExample2();

    }

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoadingPagePar2().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
