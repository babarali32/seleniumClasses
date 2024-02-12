package Selenium05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TaskFacebook01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(4000);
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");

        WebElement days=driver.findElement(By.xpath("//a[text()='Create new account']"));
        days.click();
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("FirstName");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lastname");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123lahore32pakistan@gmail.com");

        /*driver.findElement(By.xpath("//select[@fdprocessedid='ur7d93m']")).click();
        Thread.sleep(4000);*/
    }
}
