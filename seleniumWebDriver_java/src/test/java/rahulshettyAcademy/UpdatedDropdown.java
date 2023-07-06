package rahulshettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdatedDropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        driver.findElement(By.id("divpaxinfo")).click();



    }
}
