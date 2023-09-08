package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver;
    //this represents an element in a page
    //this represents the link to the form authentication page.
    By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver  = driver;
    }

    public LoginPage clickFormAuthenticaton(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public NestedFrames clickNestedFramePage() {
        clickLink("Nested Frames");
        return new NestedFrames(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public SelectOptionFromDropdown clickDropdownPage() {
        clickLink("Dropdown");
        return new SelectOptionFromDropdown(driver);
    }

    public MultipleWindows clickMultipleWindowsPage(){
        clickLink("Multiple Windows");
        return new MultipleWindows(driver);
    }

    public DynamicLoadingPagePart2 clickDynamicLoadingPagePar2(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPagePart2(driver);
    }

    public void clickLink(String linkTest) {
        driver.findElement(By.linkText(linkTest)).click();
    }
}