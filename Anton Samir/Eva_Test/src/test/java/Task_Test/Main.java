package Task_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
public class Main {
    WebDriver driver;
    SoftAssert soft = new SoftAssert();
    Test loc = new Test();
    //Test_Register loc1 = new   Test_Register();
    @Given("User Open Browser Navigate the website Page Contact-us")
    public void open_browser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32_(1)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        options.addArguments("--remote-allow-origins");
        driver.navigate().to("https://careers.evapharma.com/en/job-search-results/");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("user Press View button")
    public void valid_scenario_Contact_Button() {

        loc.Clic_Job1(driver).click();
        loc.Back_job(driver).click();
        loc.Clic_Job2(driver).click();
        loc.Back_job(driver).click();
        loc.Clic_Job3(driver).click();
        loc.Back_job(driver).click();
        loc.Clic_Job4(driver).click();
    }
}
