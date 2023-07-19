package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");

    private By result = By.id("result");
    private By triggerJSConfirmationAlert = By.xpath("//button[text()='Click for JS Confirm']");

    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");


    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }


    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void triggerConfirm(){
        driver.findElement(triggerJSConfirmationAlert).click();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_GetText(){
        return driver.switchTo().alert().getText();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_sendTextToPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
