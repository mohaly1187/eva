package testpages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class sampletest1{
    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver=new ChromeDriver();
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
        driver.quit();

    }
}
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.jumia.com.eg/");
        WebElement account =driver.findElement(By.linkText("Account"));
        account.click();
        WebElement signin =driver.findElement(By.linkText("Sign in"));
        signin.click();
        WebElement firstname=driver.findElement(By.id("first-name"));
        firstname.sendKeys("mohamed");
        WebElement lastname=driver.findElement(By.id("last-name"));
        lastname.sendKeys("emad");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("mohamedgamal@example.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("mohamed99");
        WebElement phone=driver.findElement(By.id("phone-number"));
        phone.sendKeys("12346666");
        WebElement registerbtn=driver.findElement(By.id("register-btn"));
        registerbtn.click();
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("mohamedgamal@example.com");
        driver.findElement(By.id("password")).sendKeys("mohamed99");
        WebElement loginbtn=driver.findElement(By.id("login-btn"));
        loginbtn.click();
        driver.quit();*/












        //lab3
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver =new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/radio.html");
//        driver.manage().window().maximize();
//        WebElement radio1=driver.findElement(By.id("vfb-7-1"));
//        WebElement radio2=driver.findElement(By.id("vfb-7-2"));
//        WebElement radio3=driver.findElement(By.id("vfb-7-3"));
//        radio1.click();
//        System.out.println("first");
//        radio2.click();
//        System.out.println("second");
//        radio3.click();
//        System.out.println("third");
//        if (radio1.isSelected()){
//            System.out.println("first is selected");
//        }
//        else {
//            System.out.println("yala ya ahbaaaaaaaal");
//        }


        //lab4
        //part1 dropdownlist
        //Handson1
        //        WebDriverManager.chromedriver().setup();
//        WebDriver driver =new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        Select drpcountry=new Select(driver.findElement(By.name("country")));
//        drpcountry.selectByVisibleText("BRAZIL");

        //Handson2
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://jsbin.com/osebed/2");
//        Select fruits=new Select(driver.findElement(By.id("fruits")));
//        fruits.selectByVisibleText("Banana");
//        fruits.selectByIndex(1);
//        List<WebElement>elements=fruits.getOptions();
//        int x=elements.size();
//        for (int i=0;i<x;i++){
//            String values=elements.get(i).getText();
//            System.out.println(values);


//        //part2
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.guru99.com/test/write-xpath-table.html");
//        WebElement z= driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]"));
//        System.out.println(z.getText());
//        driver.quit();

         //lab5
         //alert
//          WebDriverManager.chromedriver().setup();
//          WebDriver driver=new ChromeDriver();
//          driver.manage().window().maximize();
//          driver.get("https://demo.guru99.com/test/delete_customer.php");
//          WebElement custid=driver.findElement(By.xpath("//input[@type=text]"));
//          WebElement btn= driver.findElement(By.name("submit"));
//          custid.sendKeys("jemy");
//          btn.click();
//          Alert alert=driver.switchTo().alert();
//          alert.accept();
//          Alert alert2=driver.switchTo().alert();
//          alert2.accept();
//          driver.close();


        //multiple window
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.guru99.com/popup.php");
//        String currenthandle=driver.getWindowHandle();
//        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
//        clickHere.click();
//        String nexttab="";
//        Set<String>windowhandles=driver.getWindowHandles();
//        for (String s : windowhandles){
//            if (!currenthandle.equalsIgnoreCase(s));
//            {
//                nexttab=s;
//            }
//        }
//        driver.switchTo().window(nexttab);
//        Thread.sleep(2000);
//        driver.switchTo().window(currenthandle);
//        Thread.sleep(2000);





