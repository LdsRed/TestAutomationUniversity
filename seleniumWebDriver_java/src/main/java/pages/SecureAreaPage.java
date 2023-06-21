package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By logOutButton = By.xpath("//i[@class='icon-2x icon-signout']");

    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage clickLogoutButton() {
        driver.findElement(logOutButton).click();
        return new LoginPage(driver);
    }


    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }



}
