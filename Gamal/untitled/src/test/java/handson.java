import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class handson
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/popup.php");
        String currrent=driver.getWindowHandle();
        WebElement btn=driver.findElement(By.linkText("Click Here"));
        btn.click();
        String nexttab=" ";
        Set<String>windowhandles=driver.getWindowHandles();
        for (String s : windowhandles){
            if (!currrent.equalsIgnoreCase(s))
            {
                nexttab=s;
            }
        }
        driver.switchTo().window(nexttab);
    }
}
