package Selenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// this is the code for implicit wait.
        //Implicit wait is a type of wait in Selenium that tells the WebDriver to wait for a certain amount of time
        // before throwing a NoSuchElementException.
        // It is applied globally for all elements on which the WebDriver interacts. it gives 20 seconds to all elements
        // if first element not found then it will not go to second element and it will give error.
        WebElement find= driver.findElement(By.id("btn_basic_example"));
        /* this is for just example below code,  the implicit code written once will be implemented to the whole session.
        -------------------------------------------------------------------------------------------------------------------
            (WebElement   instagram= driver.findElement(By.linkText("Follow On Instagram")); // remove spaces in linktext.
            WebElement facebook=driver.findElement(By.linkText("Like us On Facebook"));
            WebElement both=driver.findElement(By.linkText("Follow Instagram & Facebook"));
            instagram.click();
            facebook.click();
            both.click();)
            --------------------------------------------------
         */

    }
}
