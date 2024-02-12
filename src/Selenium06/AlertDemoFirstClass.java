package Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoFirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        driver.findElement(By.id("alertButton")).click();
        Alert change=driver.switchTo().alert();
        Thread.sleep(2000);
        change.accept();
        WebElement confirmation=driver.findElement(By.cssSelector("button#confirmButton"));
        confirmation.click();
        Alert second=driver.switchTo().alert();
        Thread.sleep(2000);
        second.dismiss();

        WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
        prompt.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Hello World ");
        String prompttext=promptAlert.getText();
        System.out.println(prompttext);

        Thread.sleep(2000);
        promptAlert.accept();

    }
}
