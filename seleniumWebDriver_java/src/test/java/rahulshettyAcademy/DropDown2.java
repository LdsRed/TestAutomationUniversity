package rahulshettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDown2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://spicejet.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'] //input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'] //input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']

        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'] //div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'] //div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']")).click();
    }
}
