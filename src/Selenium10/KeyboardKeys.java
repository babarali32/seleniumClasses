package Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardKeys {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));

        userName.sendKeys("Tester", Keys.TAB);

        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));

        password.sendKeys("test",Keys.ENTER);

    }
}
