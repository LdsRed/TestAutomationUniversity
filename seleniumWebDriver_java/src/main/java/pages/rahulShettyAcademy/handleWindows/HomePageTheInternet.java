package pages.rahulShettyAcademy.handleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTheInternet {
    private WebDriver driver;

    public HomePageTheInternet(WebDriver driver) {
        this.driver = driver;
    }



    public MultipleWIndowsHandle clickMultipleWindowPage(){
        clickLInk("Multiple Windows");
        return new MultipleWIndowsHandle(driver);
    }
    private void clickLInk(String text){
        driver.findElement(By.linkText(text)).click();
    }
}
