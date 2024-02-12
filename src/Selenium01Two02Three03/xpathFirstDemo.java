package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathFirstDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

      driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Tester");

      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");


      WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
      login.click();


















    }
}
