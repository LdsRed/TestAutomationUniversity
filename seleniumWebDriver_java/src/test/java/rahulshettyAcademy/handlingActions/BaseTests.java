package rahulshettyAcademy.handlingActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.rahulShettyAcademy.handlingActions.AmazonPage;
import utils.WindowManager;

import java.time.Duration;

public class BaseTests {

    public static WebDriver driver;
    protected AmazonPage amazonPage;




    @BeforeClass
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldsla\\OneDrive\\Documentos\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        //amazonPage = new AmazonPage(driver);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        HomePage();
    }


    @BeforeMethod
    public void HomePage(){
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        amazonPage = new AmazonPage(driver);
    }
    @AfterClass
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.quit();
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


}
