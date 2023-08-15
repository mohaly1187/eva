package findingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class eva {

ChromeDriver driver;

	
	@BeforeTest
	public void openURL() {
		 driver = new ChromeDriver();
		 driver.navigate().to("https://evawebsiteprod-staging.azurewebsites.net/contactus");

	}
	@Test
	public void test() {
		
		 WebElement Name = driver.findElement(By.name("name"));
		 Name.sendKeys("Marina Nabil Gohar");
		
		 WebElement Email = driver.findElement(By.name("email"));
	     Email.sendKeys("nabilmaro8@gmail.com");
	     
	     WebElement countryCodeDropdown = driver.findElement(By.name("prefix"));
	     Select selectCountryCode = new Select(countryCodeDropdown);
	     selectCountryCode.selectByVisibleText("+20");

	     
	     WebElement Phone = driver.findElement(By.name("phone"));
	     Phone.sendKeys("1100303107");

	     
	     WebElement Subject = driver.findElement(By.name("subject"));
	     Subject.sendKeys("Hello Eva Pharmai need extra infomation about product X");

	     WebElement Message = driver.findElement(By.name("message"));
	     Message.sendKeys("Product X  .");
	     
	     WebElement Submit = driver.findElement(By.xpath("//button/span[text()='Submit']"));
	     Submit.click();
	     
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	     WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/p"));
	     Assert.assertEquals(successMessage.getText(),"Success! Your message has been sent successfully and one of our team will get back to you soon.");

	     
			}
	
	@AfterTest
	public void closeDriver() {
		//driver.quit();
	}

}