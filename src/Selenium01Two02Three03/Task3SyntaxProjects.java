package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3SyntaxProjects {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(4000);
        driver.get("https://syntaxprojects.com/index.php");
        Thread.sleep(4000);
        WebElement start=driver.findElement(By.cssSelector("a#btn_basic_example"));
                start.click();
        Thread.sleep(4000);
        WebElement demo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[1]"));
        demo.click();
        Thread.sleep(4000);
        WebElement writemessage=driver.findElement(By.cssSelector("input#user-message"));
        writemessage.sendKeys("Hello World ! ");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();


    }
}
