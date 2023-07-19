package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage{

    WebDriver driver;
    private By sendInput = By.id("target");
    private By result = By.id("result");


    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }


    public void sendText(String text){
        driver.findElement(sendInput).sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }

    public void enterPi(){
        sendText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }


}
