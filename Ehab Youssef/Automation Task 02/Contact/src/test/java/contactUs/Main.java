package contactUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");

        WebElement inputName = driver.findElement(By.xpath("//input[@name='name']"));
        inputName.sendKeys("Ehab");

        WebElement inputEmail = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        inputEmail.sendKeys("ehab@gmail.com");

        WebElement inputPhone = driver.findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys("01271234567");

        WebElement inputSubject = driver.findElement(By.xpath("//input[@name='subject']"));
        inputSubject.sendKeys("Automation Test Case");

        WebElement inputMessage = driver.findElement(By.xpath("//input[@id='custom-css-outlined-input']"));
        inputMessage.sendKeys("This is an Automation test case");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));
        submit.click();

        // Add assertions
        String successMessage = "Success! Your message has been sent successfully and one of our team will get back to you soon.";
        WebElement confirmationMessage = driver.findElement(By.xpath("//DIV[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 MuiAlert-root MuiAlert-standardSuccess MuiAlert-standard mui-style-kdwbbz']self::DIV"));
        Assert.assertEquals(confirmationMessage.getText(), successMessage, "Success! Your message has been sent successfully and one of our team will get back to you soon.");

        // Close the browser
        driver.quit();
    }
}