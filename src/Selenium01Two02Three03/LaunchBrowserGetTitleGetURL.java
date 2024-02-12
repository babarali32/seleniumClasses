package Selenium01Two02Three03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserGetTitleGetURL {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                                                            // you can use backslashes as well \\
        // next line i will need to launch my browser.

        WebDriver driver=new ChromeDriver(); // it will open the browser , but it will not navigate.
        driver.get("https://www.google.com.pk/"); // to open google page

        String url= driver.getCurrentUrl(); // to get curret url

        System.out.println(url);                // to get URL

        String title=driver.getTitle();  // to get title

        System.out.println(title);  // this is used to get th title of the page.
        driver.close();










    }
}
