package Selenium01Two02Three03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        String title=driver.getTitle();
        if (title.equals("Facebbok-Login "))
        {
            System.out.println("title is correct");
        } else {
            System.out.println("title is wrong");
        }
        driver.quit();
    }
}
