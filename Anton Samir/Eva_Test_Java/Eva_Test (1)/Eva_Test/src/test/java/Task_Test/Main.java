package Task_Test;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.evapharma.com/");
    }
    @When("user Press Contact-us button")
    public void valid_scenario_Contact_Button() {
        loc.Clic_Contact(driver).click();
    }
    @When("user input All Valid Data “ name”, ”Email” ,”phone” ,” subject” , “ massage”")
    public void valid_scenario_Contact_Us_Data() {
        loc.Enter_Name(driver).sendKeys("Anton");
        loc.Enter_Email(driver).sendKeys("antonsamir4@gmail.com");
        loc.Enter_Phone(driver).sendKeys("01287090732");
        loc.Enter_Subject(driver).sendKeys("Anton");
        loc.Enter_Message(driver).sendKeys("gfgfg fgdfgfd dfgdfgdfg");
    }
    @And("User click on the ”Submit” button")
    public void valid_scenario_Contact_UsSubmit() {
        loc.Click_Submit(driver).click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("Message successfully submission")
    public void valid_scenario_Contact_Us_Sucess(){
        soft.assertTrue(loc.Check_Sucess(driver).isDisplayed());
    }
}
