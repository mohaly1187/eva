/*package testpages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class loginpagetest {
WebDriver driver;
    @BeforeTest


    //paralleltest
    @Parameters("browser")
    public void setDriver(String s4){
     if(s4.equalsIgnoreCase("chrome")){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
     } else if (s4.equalsIgnoreCase("firefox")) {
         WebDriverManager.firefoxdriver().setup();
         driver=new FirefoxDriver();
     }
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login");
    }

//    @DataProvider(name = "loadingcredentials")
//    public static Object[][] logincredentials()
//    {
//        return new Object[][]{
//                {"Ahmed"},
//                {"Ali"},
//                {"Amir"},
//                {"Azppp"}
//        };
//    }




    @Test
    public void pardox(){
        System.out.println("jemygood");
    }
    //@Test(priority = 0)
    @Test(groups = "valid")
    public void validtest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        loginpage l=new loginpage(driver);
        l.entername("tomsmith");
        l.enterpassword("SuperSecretPassword!");
        l.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
    }
    @Test (groups = "test")
            //dataProvider = "loadingcredentials"
    public void para(String s1){
        System.out.println(s1);
    }
    @Test (groups = {"test"})
    @Parameters("username2")
    public void para2(String name2){
        System.out.println(name2);
    }
    @Test (groups = {"invalid"})
    public void invalidtest(){
    loginpage l2=new loginpage(driver);
    l2.entername("jemy");
    l2.enterpassword("123");
    l2.click();
    Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");

    }
    @AfterTest
    public void close(){
    driver.close();
    }
}



//pooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooom
//
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void before(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/login");
//    }
//    @Test
//    public void Validtest(){
//        loginpage l=new loginpage(driver);
//        l.enterUsername("tomsmith");
//        l.enterpassword("SuperSecretPassword!");
//        l.submit();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
//    }
//    @Test
//    public void Invalidtest(){
//        loginpage l2=new loginpage(driver);
//        l2.enterUsername("ahmed");
//        l2.enterpassword("456");
//        l2.submit();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
//    }
//    @AfterMethod
//    public void finish(){
//        driver.quit();
//    }





//factory
//WebDriver driver;
//    @BeforeMethod
//    public void setDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/login");
//    }
//    @Test
//    public void validtest(){
//        loginpage l=new loginpage(driver);
//        l.entername("tomsmith");
//        l.enterpassword("SuperSecretPassword!");
//        l.click();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
//    }
//    @Test
//    public void invalidtest(){
//        loginpage l2=new loginpage(driver);
//        l2.entername("jemy");
//        l2.enterpassword("123");
//        l2.click();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
//
//    }
//    @AfterMethod
//    public void close(){
//        driver.close();
//    }*/