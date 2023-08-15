import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class task4 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public  void test() {
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        WebElement Name= driver.findElement(By.name("name"));
        Name.sendKeys("Mohamed emad");
        WebElement Email= driver.findElement(By.name("email"));
        Email.sendKeys("mohamedemad147@gmail.com");
        WebElement droplist = driver.findElement(By.name("prefix"));
        Select elements =new Select(droplist);
        elements.selectByValue("+20");
        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("01090834469");
        WebElement subject =driver.findElement(By.name("subject"));
        subject.sendKeys("Taskgdedaa");
        WebElement Message=driver.findElement(By.name("message"));
        Message.sendKeys("im hereee");
        WebElement btn=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));
        btn.submit();
        String s = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/p")).getText();
        Assert.assertEquals(s,"Success! Your message has been sent successfully and one of our team will get back to you soon.");
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }

}