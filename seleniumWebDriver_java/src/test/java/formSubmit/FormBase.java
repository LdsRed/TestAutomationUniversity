package formSubmit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.formypages.FormyHomePage;

public class FormBase {

    private WebDriver driver;
    protected FormyHomePage formHomePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jordan.larcher\\Documents\\ensign\\java Automation\\TestAutomationUniversity\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        formHomePage = new FormyHomePage(driver);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
