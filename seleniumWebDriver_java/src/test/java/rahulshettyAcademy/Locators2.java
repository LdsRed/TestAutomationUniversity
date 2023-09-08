package rahulshettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Locators2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jordan.larcher\\Documents\\ensign\\java Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.tagName("p")).getText());
        assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

        driver.findElement(By.xpath("//*[text ()='Log Out']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();

        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];

        return password;
    }
}
