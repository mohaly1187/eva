package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        driver.manage().window().maximize();
        WebElement Name = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/input"));
        WebElement Email = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[2]/div/div/input"));
        WebElement Country_code = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[1]/div/div/div[1]/select"));
        WebElement Phone_Number = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[2]/div/div/input"));
        WebElement Subject = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[4]/div/div/input"));
        WebElement Message = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[5]/div/div/div/input"));
        WebElement Submit = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));

        Name.sendKeys("Madonna");
        Email.sendKeys("madonnaemad108@gmail.com");
        Select List = new Select(Country_code);
        List.selectByValue("+20");
        Phone_Number.sendKeys("01289476211");
        Subject.sendKeys("Test");
        Message.sendKeys("Hello from eva pharma");
        Submit.click();
    }
}