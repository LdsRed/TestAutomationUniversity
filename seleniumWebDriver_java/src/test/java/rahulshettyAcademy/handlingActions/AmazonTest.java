package rahulshettyAcademy.handlingActions;

import org.testng.annotations.Test;

public class AmazonTest extends BaseTests {

    @Test
    public void HomePageTest(){

        var input = "Input";
        amazonPage.typeInSearchBar(input);
        amazonPage.moveToSignIn();

    }
}
