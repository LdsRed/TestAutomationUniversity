package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormyHomePage {

    private WebDriver driver;

    private By formAuthenticationLink = By.linkText("Form");

    public FormyHomePage(WebDriver driver) { this.driver = driver;}

    public WebForm clickWebForm(){
        driver.findElement(formAuthenticationLink).click();
        return new WebForm(driver);
    }
}
