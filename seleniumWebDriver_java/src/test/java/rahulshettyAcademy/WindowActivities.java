package rahulshettyAcademy;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\jordan.larcher\\Documents\\ensign\\java Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://youtube.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

        driver.quit();

    }
}
