package pages.rahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPagePractice {
    private WebDriver driver;
    private By usernameField = By.name("username");
    private By passwordField = By.id("password");
    private By radioButtonUser = By.cssSelector(".customradio:nth-child(2)");
    //this is the okay button we find after selecting the user radio button. So, here we need an explicit wait because
    // the popup with the buttons is dynamic
    private By okayBtn = By.id("okayBtn");
    private By acceptTermsCheckbox = By.xpath("//input[@id='terms']");
    private By signInBtn = By.id("signInBtn");
    private By dropdown = By.xpath("//select[@class='form-control']");

    public LoginPagePractice(WebDriver driver){
        this.driver = driver;
    }


    public ProtoCommerceHomePage loginToProtonPage(String username, String password, String option){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(radioButtonUser).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(okayBtn));
        driver.findElement(okayBtn).click();
        selectFromDropDown(option);
        //driver.findElement(acceptTermsCheckbox).click();
        driver.findElement(signInBtn).click();
        return new ProtoCommerceHomePage(driver);
    }


    private void selectFromDropDown(String option){
        Select dropDownElement = new Select(driver.findElement(dropdown));
        dropDownElement.selectByVisibleText(option);
    }
}
