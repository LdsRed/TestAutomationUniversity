import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class alertTests  extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text incorrect");

    }


    @Test
    public void testDismissAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerConfirm();

        String text = alertsPage.alert_GetText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetPrompt() {
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerPrompt();

        String text = "Hola como estas chanchita";

        alertsPage.alert_sendTextToPrompt(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(),"You entered: " + text, "Results text incorrect");

    }
}
