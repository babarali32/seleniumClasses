package Selenium05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo1st {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement days=driver.findElement(By.id("select-demo"));

        Select weekdays=new Select(days);
        weekdays.selectByIndex(4);
        Thread.sleep(4000);
        weekdays.selectByVisibleText("Friday");
        Thread.sleep(3000);

        weekdays.selectByValue("Sunday");

         List<WebElement> alloption =weekdays.getOptions();
         int sizee=alloption.size();
        System.out.println(sizee);
        for(int i=0; i<sizee; i++){   //if you start i from 0 it will print please select option also
            String text=alloption.get(i).getText();
            System.out.println(text);
            weekdays.selectByIndex(i);
            Thread.sleep(2000);
        }
    }
}
