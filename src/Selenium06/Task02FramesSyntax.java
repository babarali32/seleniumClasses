package Selenium06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02FramesSyntax {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/bootstrap-iframe.php");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

       WebElement applybuttion=driver.findElement(By.xpath("//div[text()='Apply now']"));
       boolean enable=applybuttion.isEnabled();
        System.out.println(enable);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement frame2=driver.findElement(By.xpath("//img[@src='https://assets-global.website-files.com/6004fa811a07c5ae5a5d58e9/6478fb0a5eef8f0d27d26c10_Syntax%20Tech%20white%20Logo.png']/ancestor::a[1]"));
        boolean show=frame2.isDisplayed();
        System.out.println(show);





    }
}
