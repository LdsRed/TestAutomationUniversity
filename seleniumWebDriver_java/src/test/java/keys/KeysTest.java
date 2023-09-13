package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class  KeysTest extends BaseTests {


    @Test
    public void keyTest() {
        var keyPage = homePage.clickKeyPresses();

        keyPage.sendText("A" + Keys.BACK_SPACE);

        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterPi();
    }
}
