package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
    WebDriver driver;
    public loginpage(WebDriver driver){
        this.driver=driver;
    }
    By user=By.id("username");
    By pass=By.id("password");
    By btn=By.xpath("//Button[@Type='submit']");

    public void setuser(String mo){
        driver.findElement(user).sendKeys(mo);
    }
    public void setPass(String passw){
        driver.findElement(pass).sendKeys(passw);
    }
    public void click(){
        driver.findElement(btn).click();
    }



























//        WebDriver driver;
//        public loginpage(WebDriver driver){
//            this.driver=driver;
//            PageFactory.initElements(driver,this);
//        }
//
//        @FindBy(id="username")
//        WebElement username;
//        @FindBy(id = "password")
//        WebElement password;
//        @FindBy(xpath = "//Button[@Type='submit']")
//        WebElement loginbutton;
//        public void setUsername(String uname){
//            username.sendKeys(uname);
//        }
//        public void setpass(String pass){
//            password.sendKeys(pass);
//        }
//
//        public void clickonlogbutton(){
//            loginbutton.click();
//        }



























//    WebDriver driver;
//    public loginpage(WebDriver driver){
//        this.driver=driver;
//    }
//    By username=By.id("username");
//    By password=By.id("password");
//    By loginbtn=By.xpath("//Button[@Type='submit']");
//    public void setusername(String uname){
//        driver.findElement(username).sendKeys(uname);
//    }
//    public void setpass(String pass){
//        driver.findElement(password).sendKeys(pass);
//    }
//    public void clickonbtn(){
//        driver.findElement(loginbtn).click();
//    }
}
