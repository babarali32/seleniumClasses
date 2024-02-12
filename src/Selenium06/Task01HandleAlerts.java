package Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01HandleAlerts {
    public static void main(String[] args){
                System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement one=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        one.click();
        Alert first=driver.switchTo().alert();
        first.accept();
        System.out.println("--------------------");
        WebElement two=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        two.click();
        Alert second=driver.switchTo().alert();
        second.dismiss();
        System.out.println("----------------------");
        WebElement three=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        three.click();
        Alert thrice=driver.switchTo().alert();
        thrice.sendKeys("i am propmt alert !");
//        thrice.accept();









    }}
