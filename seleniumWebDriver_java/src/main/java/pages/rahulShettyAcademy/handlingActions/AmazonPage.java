package pages.rahulShettyAcademy.handlingActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonPage {

    private WebDriver driver;
    private WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    private WebElement navTab = driver.findElement(By.cssSelector("a[id='nav-link-accountList-nav-line-1']"));

    WebElement move = navTab;



    public AmazonPage(WebDriver driver) {
        this.driver = driver;
    }

    Actions act = new Actions(driver);

    public void moveToSignIn(){
        act.moveToElement(move).build().perform();
    }

    public void typeInSearchBar(String input){
        act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys(input).doubleClick().build().perform();
    }


}
