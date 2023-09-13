package pages.formypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebForm {

    private WebDriver driver;

    private By firstName = By.id("first-name");
    private By lastName = By.xpath("//input[@id='last-name']");

    private By jobTitle = By.cssSelector("#job-title");

    private By educationLevel = By.cssSelector("#radio-button-2");
    private By sex = By.xpath("//input[@id='checkbox-3']");
    private By submitButton = By.className("btn");
    private By selectYearsMenu = By.id("select-menu");




    public WebForm(WebDriver driver){ this.driver = driver;}


    public void selectYearsOfExeprience(String item){
        Select selectYearExperience = new Select(driver.findElement(selectYearsMenu));
        selectYearExperience.selectByVisibleText(item);
    }

    public void fillForm(String name, String last, String title) {
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(lastName).sendKeys(last);
        driver.findElement(jobTitle).sendKeys(title);
        driver.findElement(educationLevel).click();
        driver.findElement(sex).click();
    }

    public ThanksPage submitForm() {
        driver.findElement(submitButton).click();
        return new ThanksPage(driver);
    }


}
