package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03FbAccount {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver drive=new ChromeDriver();
        drive.navigate().to("https://web.facebook.com/?_rdc=1&_rdr");

        Thread.sleep(10000);
        drive.findElement(By.xpath("//a[text()='Create new account']")).click();
// first name
        Thread.sleep(4000);
        drive.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
        Thread.sleep(4000);
        // last name
        drive.findElement(By.xpath("//input[@name='lastname']/preceding-sibling::div")).sendKeys("lastname");
        Thread.sleep(4000);
        // email id or phone number
        drive.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("abc@gmail.com");
        Thread.sleep(4000);
        // verify email id
        drive.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("abc@gmail.com");
        Thread.sleep(4000);

        drive.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("PakistaN32");
        Thread.sleep(4000);
        drive.findElement(By.xpath("//button[@name='websubmit']/parent::div")).click();
        Thread.sleep(4000);
        drive.findElement(By.xpath("//img[@id='u_3_9_LA']/parent::div")).click();
        Thread.sleep(4000);
       // drive.close();



    }
}
