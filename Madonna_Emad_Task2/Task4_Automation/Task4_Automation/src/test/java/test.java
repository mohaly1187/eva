import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class test {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        driver.manage().window().maximize();
    }

    @Test
    public void testContactFormSubmission() throws InterruptedException {
        WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email']"));
        WebElement countryCode= driver.findElement(By.xpath("//select[@placeholder='Select']"));
        WebElement Phone_Number = driver.findElement(By.xpath("//input[@placeholder='Your phone']"));
        WebElement subject = driver.findElement(By.xpath("//input[@placeholder='Your subject']"));
        WebElement message = driver.findElement(By.xpath("//input[@id='custom-css-outlined-input']"));
        WebElement submit = driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Name.sendKeys("Madonna Emad");
        email.sendKeys("madonnaemad108@gmail.com");
        Select codeLists = new Select(countryCode);
        codeLists.selectByValue("+20");
        Phone_Number.sendKeys("01289476211");
        subject.sendKeys("Test");
        message.sendKeys("Hello from eva pharma");
        submit.click();

        By toastLocator = By.xpath("//div[@class='toast-success' and contains(text(),'Message sent successfully')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
    }

    @AfterTest
    public void close() {

            driver.quit();
    }
}
