package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class evatestcase {
	 

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        WebElement nameField = driver.findElement(By.xpath("*[@id="__next"]/div[2]/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/input"));
		nameField.sendKeys("Abram Ashraf");
		
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("AbramAshraf@example.com");
        
        WebElement messageField = driver.findElement(By.xpath("//textarea[@name='phone']"));
        messageField.sendKeys("01272975875.");
        
        WebElement messageField = driver.findElement(By.xpath("//textarea[@name='subject']"));
        messageField.sendKeys("home.");
        
        WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
        messageField.sendKeys("This is a message from Abram Ashraf.");
       
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

	}

}
