package Selenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");
        String handlevalue=driver.getWindowHandle();  // this is no a web element ok.
        System.out.println(handlevalue);

        WebElement link=driver.findElement(By.linkText("Help"));
        link.click();

        Set<String> all=driver.getWindowHandles();
        System.out.println(all.size());
        System.out.println(all);
        System.out.println("-----------------------------");
        // use iterator to get all handles from the set of string

        Iterator<String> once=all.iterator();
        handlevalue=once.next();  // the purpose of this line is to get handle value of main page, first page. this is redeclare the value. example (int a=10;  a=29;)
         String childHandle= once.next();
        System.out.println(childHandle);

        Thread.sleep(4000);
        driver.switchTo().window(handlevalue);

        driver.close();  // it will only close the main page, because focus of selenium is only main page.

        driver.quit();


    }
}
