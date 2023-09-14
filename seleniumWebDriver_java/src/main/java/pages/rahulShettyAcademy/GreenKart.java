package pages.rahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class GreenKart {


    private WebDriver driver;
    //this represents an element in a page
    //this represents the link to the form authentication page.
    private By productsName = By.cssSelector("h4.product-name");

    private By addToCartButton = By.xpath("//div[@class='product-action']/button");

    private By addMoreItems = By.xpath("//a[text()='+']");

    private By promoCode = By.xpath("//input[@class='promoCode']");

    private By cartButton = By.cssSelector("img[alt='Cart']");

    private By proceedToCheckOutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')] ");



    int count = 0;

    public GreenKart(WebDriver driver){
        this.driver  = driver;
    }


    public void addToCart(String[] productsNeeded, int amountItemsNeeded){


        List<WebElement> products = driver.findElements(productsName);




        for (int i = 0; i < products.size(); i++){

            String[] product_name = products.get(i).getText().split("-");
            String formattedName = product_name[0].trim();


            List<String> itemsNeededList = Arrays.asList(productsNeeded);

            if (itemsNeededList.contains(formattedName)){

                for (int j = 0; j < (amountItemsNeeded - 1); j++) {

                    driver.findElements(addToCartButton).get(i).click();
                    count++;
                }
                if(count == itemsNeededList.size()) {
                    break;
                }


            }
        }

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.)
    }

    public CartPage clickProceedButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(cartButton).click();
        driver.findElement(proceedToCheckOutButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(promoCode));
        return new CartPage(driver);
    }

    public void clickLink(String linkTest) {
        driver.findElement(By.linkText(linkTest)).click();
    }
}