package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        WebElement countryCode= driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[1]/div/div/div[1]/select"));
        WebElement Phone_Number = driver.findElement(By.xpath("//input[@name='phone']"));
        WebElement subject = driver.findElement(By.xpath("//input[@name='subject']"));
        WebElement message = driver.findElement(By.xpath("//input[@id='custom-css-outlined-input']"));
        WebElement submit = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));

        Name.sendKeys("Madonna Emad");
        email.sendKeys("madonnaemad108@gmail.com");
        Select codeLists = new Select(countryCode);
        codeLists.selectByValue("+20");
        Phone_Number.sendKeys("01289476211");
        subject.sendKeys("Test");
        message.sendKeys("Hello from eva pharma");
        submit.click();

        Thread.sleep(2000);
        By toastLocator = By.xpath("/html/body/div/div[2]/div[1]");
        String actualToastMessage = driver.findElement(toastLocator).getText();

        String expectedToastMessage = "Success! Your message has been sent successfully and one of our team will get back to you soon.";
        Assert.assertEquals(actualToastMessage,expectedToastMessage);
    }

    @AfterTest
    public void close() {

            driver.quit();
    }
}
