import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class sampletest1 {
    @Test
    public void sampleTest1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement radiobtn1=driver.findElement(By.id("vfb-7-1"));
        WebElement radiobtn2=driver.findElement(By.id("vfb-7-2"));
        WebElement radiobtn3=driver.findElement(By.id("vfb-7-3"));
        radiobtn2.click();
        radiobtn1.click();
        radiobtn3.click();
        WebElement chk1=driver.findElement(By.id("vfb-6-0"));
        WebElement chk2=driver.findElement(By.id("vfb-6-1"));
        WebElement chk3=driver.findElement(By.id("vfb-6-2"));
        chk1.click();
        chk2.click();
        chk3.click();
        if (chk3.isSelected()){
            System.out.println("chk3 is pressed");
        }
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

        }



}
