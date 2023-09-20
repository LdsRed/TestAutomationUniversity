package pages.rahulShettyAcademy.handleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWIndowsHandle {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");



    public MultipleWIndowsHandle(WebDriver driver) {
        this.driver = driver;
    }


    public void clickHereLink(){
        driver.findElement(clickHereLink).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        String titleChild = driver.findElement( By.className("example")).getText().split(" ")[1].trim();
        System.out.println(titleChild);
        driver.switchTo().window(parentWindow);
        String titleParent = driver.findElement(By.xpath("//div[@class='example'] //h3")).getText().split("new")[1].trim();
        System.out.println(titleParent);
        //return new ChildPage(driver);
    }



}
