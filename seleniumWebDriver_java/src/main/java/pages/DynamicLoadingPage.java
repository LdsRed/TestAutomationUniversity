package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;

    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private String linkXpath_Format_Example2 = ".//a[contains(text(), '%s')]";
    private By link_example2 = By.xpath(String.format(linkXpath_Format_Example2, "Example 2"));
    private By link_example1 = By.xpath(String.format(linkXpath_Format,"Example 1"));

    public DynamicLoadingPage(WebDriver driver) {
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
}
