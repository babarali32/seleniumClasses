import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.commonMethods.driver;

public class roughClasshrm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver drive=new ChromeDriver();     // it will open the browser , but it will not navigate.
        drive.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");

        drive.manage().window().maximize();

        WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
//        WebElement pas1=driver.findElement(By.xpath("//input[@id='txtPassword']"));
//        pas1.sendKeys("");
        WebElement login=driver.findElement(By.id("btnLogin"));
        login.click();
    }
}
