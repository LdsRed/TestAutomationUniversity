package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebForm {

    private WebDriver driver;

    private By firstName = By.id("first-name");
    private By lastName = By.xpath("//input[@id='last-name']");

    private By jobTitle = By.cssSelector("#job-title");

    private By educationLevel = By.cssSelector("#radio-button-2");
    private By sex = By.xpath("//input[@id='checkbox-3']");



    public WebForm(WebDriver driver){ this.driver = driver;}


    public void selectYearsOfExeprience(){
        Select selectYearExperience = new Select(driver.findElement(By.id("select-menu")));
    }


}
