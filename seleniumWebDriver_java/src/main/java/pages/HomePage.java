package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver;
    //this represents an element in a page
    //this represents the link to the form authentication page.
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver  = driver;
    }

    public LoginPage clickFormAuthenticaton(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}