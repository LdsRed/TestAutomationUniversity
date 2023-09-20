package rahulshettyAcademy.multipleWindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.rahulShettyAcademy.handleWindows.HomePageTheInternet;
import utils.WindowManager;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    protected HomePageTheInternet homePage;


    @BeforeClass
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver", "/home/flia/Documentos/TestAutomationUniversity/chromedriver-linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        homePage = new HomePageTheInternet(driver);

        goHome();
    }


    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePageTheInternet(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.quit();
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


}
