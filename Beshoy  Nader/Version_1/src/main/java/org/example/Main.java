package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        driver.manage().window().maximize();
        WebElement UserName_TextBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/input"));
        WebElement Email_TextBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[2]/div/div/input"));
        WebElement PhoneNumber_SelectBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[1]/div/div/div[1]/select"));
        WebElement PhoneNumber_TextBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[2]/div/div/input"));
        WebElement Subject_TextBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[4]/div/div/input"));
        WebElement Message_TextBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[5]/div/div/div/input"));
        WebElement Submit_Button = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));
        UserName_TextBox.sendKeys("Beshoy Nader");
        Email_TextBox.sendKeys("Beshonader66@gmail.com");
        Select DropDown_List = new Select(PhoneNumber_SelectBox);
        DropDown_List.selectByValue("+20");
        PhoneNumber_TextBox.sendKeys("01225737441");
        Subject_TextBox.sendKeys("Testing Sybject TextBox");
        Message_TextBox.sendKeys("Testing Email TextBox");
        Submit_Button.click();
        String expectedToastMessage = "Success! Your message has been sent successfully and one of our team will get back to you soon.";
        Thread.sleep(2000);
        By toastLocator = By.xpath("/html/body/div/div[2]/div[1]");
        String actualToastMessage = driver.findElement(toastLocator).getText();
        System.out.println(actualToastMessage);
        if (actualToastMessage.contains(expectedToastMessage)) {
            System.out.println("Happy Scenario TestCase is successfully pass ");
        } else {
            System.out.println("Toast message is not correct.");
        }

    }
}