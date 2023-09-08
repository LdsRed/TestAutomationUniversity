package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticaton();
        loginPage.setUsername("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");

        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");

    }
}
