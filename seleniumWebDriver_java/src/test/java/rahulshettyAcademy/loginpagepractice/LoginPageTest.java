package rahulshettyAcademy.loginpagepractice;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTests {

    @Test
    public void testLoginPage() {
        var loginPage = loginPagePractice;

        String option1 = "Teacher";

        var protoCommerceHome = loginPage.loginToProtonPage("rahulshettyacademy", "learning", option1);

        protoCommerceHome.addProductsToTheCart();


    }
}
