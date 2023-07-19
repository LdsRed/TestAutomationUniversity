package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);

        goHome();
    }


    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


}
