package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://evawebsiteprod-staging.azurewebsites.net/contactus");
        driver.manage().window().maximize();
    }

    @Test
    public void testContactFormSubmission() throws InterruptedException {
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@name='name']"));
        WebElement emailTextBox = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        WebElement phoneNumberSelectBox = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[3]/div[1]/div[1]/div/div/div[1]/select"));
        WebElement phoneNumberTextBox = driver.findElement(By.xpath("//input[@name='phone']"));
        WebElement subjectTextBox = driver.findElement(By.xpath("//input[@name='subject']"));
        WebElement messageTextBox = driver.findElement(By.xpath("//input[@id='custom-css-outlined-input']"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/div/form/div/div[6]/button"));

        userNameTextBox.sendKeys("Beshoy Nader");
        emailTextBox.sendKeys("Beshonader66@gmail.com");
        Select dropDownList = new Select(phoneNumberSelectBox);
        dropDownList.selectByValue("+20");
        phoneNumberTextBox.sendKeys("01225737441");
        subjectTextBox.sendKeys("Testing Subject TextBox");
        messageTextBox.sendKeys("Testing Message TextBox");
        submitButton.click();

        Thread.sleep(2000);
        By toastLocator = By.xpath("/html/body/div/div[2]/div[1]");
        String actualToastMessage = driver.findElement(toastLocator).getText();

        String expectedToastMessage = "Success! Your message has been sent successfully and one of our team will get back to you soon.";
        Assert.assertEquals(actualToastMessage,expectedToastMessage);
    }

    @AfterClass
    public void tearDown() {

            driver.quit();
    }
}
