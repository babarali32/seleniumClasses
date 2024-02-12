package Selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxesDemo {
    //static String url="https://syntaxprojects.com/basic-checkbox-demo.php";
    public static void main(String[] args) throws InterruptedException {


       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

       List<WebElement> option=driver.findElements(By.cssSelector("input[class='cb1-element']"));
        System.out.println("-------------------------------");
       System.out.println(option.size());

        for (WebElement all:option
             ) {
            all.getAttribute("value");
            if(all.getAttribute("value").equals("Option-2")){
                all.click();
                Thread.sleep(2000);
            }
        }
       

}}
