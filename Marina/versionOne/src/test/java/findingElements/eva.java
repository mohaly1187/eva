package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	     
	     WebElement Submit = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));
	     Submit.click();
	     

	     WebElement successMessage = driver.findElement(By.xpath("/html/body/div/div[1]/span/div/div/div[2]"));
	     System.out.println(successMessage.getText()); 
	     

	     
			}
	
	@AfterTest
	public void closeDriver() {
		//driver.quit();
	}

}