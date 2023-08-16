package Task_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Test {

    WebElement Clic_Contact (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//h6[normalize-space()='Contact Us']"));
        return ant;
    }

    WebElement Enter_Name (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
        return ant;
    }
    WebElement Enter_Email (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//input[@placeholder='Your email']"));
        return ant;
    }

    WebElement Enter_Phone  (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//input[@placeholder='Your phone']"));
        return ant;
    }
    WebElement Enter_Subject (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//input[@placeholder='Your subject']"));
        return ant;
    }
    WebElement Enter_Message (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//input[@id='custom-css-outlined-input']"));
        return ant;
    }
    WebElement Click_Submit (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
        return ant;
    }

    WebElement Check_Sucess (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div"));
        return ant;
    }
}
