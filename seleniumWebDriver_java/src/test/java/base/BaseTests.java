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
import utils.WindowManager;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/home/flia/Documentos/TestAutomationUniversity/chromedriver-linux64/chromedriver");
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
<<<<<<< HEAD
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
=======
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
>>>>>>> 7739b21f30b5dee43957a925bbf43fa74e8983b4
        driver.quit();
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


}
