package pages.rahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.List;

public class HomePage {


    private WebDriver driver;
    //this represents an element in a page
    //this represents the link to the form authentication page.
    private By productsName = By.cssSelector("h4.products-name");

    private By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
    public HomePage(WebDriver driver){
        this.driver  = driver;
    }





    public void addToCart(List productsNeeded){


        List<WebElement> products = driver.findElements(productsName);


        String nameProduct;


        for (int i = 0; i < products.size(); i++){

            nameProduct = products.get(i).getText();

            if (productsNeeded.contains(nameProduct)){
                driver.findElements(addToCartButton).get(i).click();
            }
        }
    }


    public void clickLink(String linkTest) {
        driver.findElement(By.linkText(linkTest)).click();
    }
}