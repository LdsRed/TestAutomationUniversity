package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DynamicLoadingPagePart2 {

    private WebDriver driver;

    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private String linkXpath_Format_Example2 = ".//a[contains(text(), '%s')]";
    private By link_example2 = By.xpath(String.format(linkXpath_Format_Example2, "Example 2"));
    private By link_example1 = By.xpath(String.format(linkXpath_Format,"Example 1"));

    private By startButton = By.id("start");

    public DynamicLoadingPagePart2(WebDriver driver) {
        this.driver = driver;
    }


    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample1Page clickExample2(){
        driver.findElement(link_example2).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page rightClickOnExample2Link(){
        driver.findElement(link_example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }

    public boolean isStartButtonDisplayed() {
        return driver.findElement(startButton).isDisplayed();
    }
}
