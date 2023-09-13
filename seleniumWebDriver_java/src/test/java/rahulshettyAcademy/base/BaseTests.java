package rahulshettyAcademy.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.rahulShettyAcademy.GreenKart;
import utils.WindowManager;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    protected GreenKart greenKart;


    @BeforeClass
    public void setUp() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldsla\\OneDrive\\Documentos\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        greenKart = new GreenKart(driver);

        goHome();
    }


    @BeforeMethod
    public void goHome(){
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        greenKart = new GreenKart(driver);

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.quit();
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


}
