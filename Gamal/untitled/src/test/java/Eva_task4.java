import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Eva_task4 {
    WebDriver driver;
    @BeforeTest
    public void installition(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public  void test() {
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        driver.manage().window().maximize();
        WebElement Name= driver.findElement(By.name("name"));
        Name.sendKeys("Mohamed Gamal");
        WebElement Email= driver.findElement(By.name("email"));
        Email.sendKeys("mohamedgemy181@gmail.com");
        WebElement droplist = driver.findElement(By.name("prefix"));
        Select elements =new Select(droplist);
        elements.selectByIndex(1);
        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("0128659569");
        WebElement subject =driver.findElement(By.name("subject"));
        subject.sendKeys("Taskone");
        WebElement Message=driver.findElement(By.name("message"));
        Message.sendKeys("hello");
        WebElement btn=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));
        btn.submit();
        String s = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/p")).getText();
        Assert.assertEquals(s,"Success! Your message has been sent successfully and one of our team will get back to you soon.");
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }

}
