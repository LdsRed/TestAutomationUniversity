package rahulshettyAcademy.loginpagepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.rahulShettyAcademy.GreenKart;
import pages.rahulShettyAcademy.LoginPagePractice;
import utils.WindowManager;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    protected LoginPagePractice loginPagePractice;




    @BeforeClass
    public void setUp() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ldsla\\OneDrive\\Documentos\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        loginPagePractice = new LoginPagePractice(driver);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        goLoginPage();
    }


    @BeforeMethod
    public void goLoginPage(){
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        loginPagePractice = new LoginPagePractice(driver);
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
