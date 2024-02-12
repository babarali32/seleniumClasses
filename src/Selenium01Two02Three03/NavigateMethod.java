package Selenium01Two02Three03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver num=new ChromeDriver(); // // it will open the browser , but it will not navigate.
        num.get("https://www.facebook.com/"); // this method do not go back and forward.
        num.navigate().to("https://www.alibaba.com/");  // we have two navigate ways , which one will run first.
        num.navigate().back();   // to get back the webpages
        num.navigate().forward();       // to move forward the webpages
        Thread.sleep(4000); // take pause for 4 seconds.

        num.navigate().refresh();   // this is used to refresh the page/reload the page.


        num.close(); // this closes only one tab/current tab.
        num.quit();    // this closes all the tabs/close whole session..




}}
