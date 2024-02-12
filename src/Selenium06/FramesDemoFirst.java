package Selenium06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemoFirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

            driver.switchTo().frame(0);  // this is switch to frame
        WebElement textbox=driver.findElement(By.className("form-control"));

        textbox.sendKeys("i am Frame in Selenium");
        driver.switchTo().defaultContent(); // here it is command to out back to the main page.

        driver.switchTo().frame("textfieldIframe");  // this is a second way to switch from main page to inside frame.
        textbox.clear();
        textbox.sendKeys("frame find by id or name");
        textbox.clear();
        driver.switchTo().defaultContent();

        WebElement wbelemnt=driver.findElement(By.xpath("//iframe[@name='textfield-iframe']"));
        driver.switchTo().frame(wbelemnt);
        wbelemnt.sendKeys("frame access by webelement");



    }
}
