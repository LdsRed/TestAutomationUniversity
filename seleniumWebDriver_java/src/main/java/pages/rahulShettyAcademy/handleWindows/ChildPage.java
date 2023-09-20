package pages.rahulShettyAcademy.handleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildPage {

    private WebDriver driver;

    private By title = By.className("example");
    public ChildPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getText(){

        return driver.findElement(title).getText();
    }


}
