package pages.rahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;

    private By promoCodeInput = By.xpath("//input[@class='promoCode']");
    private By applyButton = By.xpath("//button[@class='promoBtn']");

    private By codeMessage = By.cssSelector("span.promoInfo");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }


    public void inputCode(String promoCode){
        driver.findElement(promoCodeInput).sendKeys(promoCode);
        driver.findElement(applyButton).click();

    }

    public String getText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(codeMessage));
        return driver.findElement(codeMessage).getText();
    }



}
