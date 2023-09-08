package rahulshettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropDown);

        dropdown.selectByIndex(1);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println();

        Thread.sleep(2000);
        driver.quit();

    }
}
