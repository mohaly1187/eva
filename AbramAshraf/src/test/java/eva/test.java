package eva;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void submitContactForm() {
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");

        WebElement nameField = driver.findElement(By.xpath("//input[@name='name']"));
        nameField.sendKeys("Abram Ashraf");

        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("AbramAshraf@example.com");

        WebElement selectphoneField = driver.findElement(By.xpath("//select[@name='phone']"));
        selectphoneField.sendKeys("01272975875.");

        WebElement phoneField = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneField.sendKeys("01272975875.");

        WebElement subjectField = driver.findElement(By.xpath("//input[@name='subject']"));
        subjectField.sendKeys("home.");

        WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
        messageField.sendKeys("This is a message from Abram Ashraf.");

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        System.out.println("Form submitted successfully!");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
