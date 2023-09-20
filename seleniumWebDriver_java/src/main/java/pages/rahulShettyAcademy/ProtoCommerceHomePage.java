package pages.rahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProtoCommerceHomePage {

    private WebDriver driver;
    private By checkOut = By.xpath("//a[@class='nav-link btn btn-primary']");
    private By addButton = By.xpath("//button[@class='btn btn-info']");

    public ProtoCommerceHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductsToTheCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut));
        List<WebElement> products = driver.findElements(addButton);

        for(int i =0;i<products.size();i++) {
            products.get(i).click();
        }

        driver.findElement(checkOut).click();
    }
}
