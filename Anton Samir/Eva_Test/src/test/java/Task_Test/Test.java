package Task_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Test {

    WebElement Clic_Job1 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//div[@class='search-jobs-app margin_bottom_30']/following-sibling::a[normalize-space()='People Operations Specialist - SSA']"));
        return ant;
    }

    WebElement  Back_job (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//li[@class='on']//a"));
        return ant;
    }
    WebElement Clic_Job2 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//div[@class='search-jobs-app margin_bottom_30']/following-sibling::a[@title='Financial Analyst']"));
        return ant;
    }

    WebElement Clic_Job3  (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//div[@class='search-jobs-app margin_bottom_30']/following-sibling::a[@title='Legal Advisor']"));
        return ant;
    }
    WebElement Clic_Job4 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("///div[@class='search-jobs-app margin_bottom_30']/following-sibling::a[@title='Treasury Accountant']"));
        return ant;
    }
}
