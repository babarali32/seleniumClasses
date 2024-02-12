package Selenium01Two02Three03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver drive=new ChromeDriver();     // it will open the browser , but it will not navigate.
        drive.navigate().to("https://www.facebook.com/");

        drive.manage().window().maximize(); // this is the method to maximize windwo.

        drive.manage().window().fullscreen(); // this is method for full screen./you willnot see tabs, bookmarks just see full screen.

    }
}
