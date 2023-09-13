package pages.rahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

<<<<<<< HEAD
import java.time.Duration;
=======
>>>>>>> 7739b21f30b5dee43957a925bbf43fa74e8983b4
import java.util.Arrays;
import java.util.List;

public class GreenKart {


    private WebDriver driver;
    //this represents an element in a page
    //this represents the link to the form authentication page.
    private By productsName = By.cssSelector("h4.product-name");

<<<<<<< HEAD
    private By addToCartButton = By.xpath("//div[@class='product-action']/button");
=======
    private By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
>>>>>>> 7739b21f30b5dee43957a925bbf43fa74e8983b4
    private By addMoreItems = By.xpath("//a[text()='+']");

    int count = 0;

    public GreenKart(WebDriver driver){
        this.driver  = driver;
    }


    public void addToCart(String[] productsNeeded, int amountItemsNeeded){


        List<WebElement> products = driver.findElements(productsName);




        for (int i = 0; i < products.size(); i++){

            String[] product_name = products.get(i).getText().split("-");
            String formattedName = product_name[0].trim();


            List itemsNeededList = Arrays.asList(productsNeeded);

            if (itemsNeededList.contains(formattedName)){

<<<<<<< HEAD
                for (int j = 0; j < (amountItemsNeeded - 1); j++){
=======
                for (int j = 0; j <= amountItemsNeeded; j++){
>>>>>>> 7739b21f30b5dee43957a925bbf43fa74e8983b4
                    driver.findElements(addMoreItems).get(i).click();
                }
                driver.findElements(addToCartButton).get(i).click();
                count++;
<<<<<<< HEAD
                if(count == itemsNeededList.size()) {
                    break;
                }


            }
        }


=======
                if(count == 3) {
                    break;
                }
            }
        }
>>>>>>> 7739b21f30b5dee43957a925bbf43fa74e8983b4
    }


    public void clickLink(String linkTest) {
        driver.findElement(By.linkText(linkTest)).click();
    }
}