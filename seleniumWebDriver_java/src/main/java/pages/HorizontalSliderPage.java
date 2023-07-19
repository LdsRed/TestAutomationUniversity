package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class HorizontalSliderPage {

    WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    // private By slider = By.xpath("//div[@class='sliderContainer'] //input[@type='range']");
    private By range = By.id("range");




    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveToTheRight(String num){
        for (int i = 0; ; i++) {
            if (!getResults().equals(num)) {
                driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
            }
            else {
                break;
            }
        }

    }

    public void moveToTheLeft(String value) {
        while (!getResults().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_LEFT);
        }
    }

    public String getResults() {
        return driver.findElement(range).getText();
    }
}
