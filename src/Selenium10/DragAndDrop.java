package Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        WebElement frme=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frme);
        WebElement pick=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));

        Actions mix=new Actions(driver);
       // mix.dragAndDrop(pick,drop);

        mix.clickAndHold(pick).moveToElement(drop).release().build().perform();





    }
}
