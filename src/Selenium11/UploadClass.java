package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement file=driver.findElement(By.id("file-upload"));
        file.sendKeys("C:\\Users\\Engr. Rao Islam\\Desktop/IMG-20220115-WA0003.jpg");
        WebElement uplod=driver.findElement(By.id("file-submit"));
        uplod.click();
    }
}
