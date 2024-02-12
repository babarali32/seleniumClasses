package Selenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedHandles {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
             String  mainHandle  = driver.getWindowHandle();
            WebElement   instagram= driver.findElement(By.linkText("Follow On Instagram")); // remove spaces in linktext.

            WebElement facebook=driver.findElement(By.linkText("Like us On Facebook"));

            WebElement both=driver.findElement(By.linkText("Follow Instagram & Facebook"));
            instagram.click();
            facebook.click();
            both.click();

            Set<String> allHandles= driver.getWindowHandles();
        System.out.println(allHandles.size());
        Iterator<String> iter=allHandles.iterator();

        while (iter.hasNext()){
            String val1=iter.next();
            if(!mainHandle.equals(val1)) {

                driver.switchTo().window(val1);
                String title = driver.getTitle();
                System.out.println("title is ----> " + title);
                driver.close();

            }

        }
                driver.switchTo().window(mainHandle); // switch back to main window first
                instagram.click();







    }}
