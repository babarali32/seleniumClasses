package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver drive=new ChromeDriver();     // it will open the browser , but it will not navigate.
        drive.get("https://www.facebook.com/");

        drive.manage().window().maximize();

        drive.findElement(By.id("email")).sendKeys("babara32@gmail.com");
        drive.findElement(By.id("pass")).sendKeys("pak32");
        drive.findElement(By.name("login")).click();
        Thread.sleep(3000);
       // drive.findElement(By.linkText("Forgotten password?")).click();
        drive.findElement(By.partialLinkText("password")).click();

    }
}
