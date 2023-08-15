package contactUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        System.out.println(driver.getTitle());
        WebElement inputName = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/input"));
        inputName.sendKeys("Ehab");
        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[2]/div/div/input"));
        inputEmail.sendKeys("ehab@gmail.com");
        WebElement inputPhone = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[2]/div/div/input"));
        inputPhone.sendKeys("01271234567");
        WebElement inputSubject = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[4]/div/div/input"));
        inputSubject.sendKeys("Automation Test Case");
        WebElement inputMessage = driver.findElement(By.xpath("//*[@id=\"custom-css-outlined-input\"]"));
        inputMessage.sendKeys("This is an Automation test case");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));
        submit.click();
    }
    
    public static void main(String[] args){
        Main test = new Main();
        test.setUp();
    }
}