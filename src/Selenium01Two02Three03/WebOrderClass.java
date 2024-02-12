package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver name=new ChromeDriver();
        name.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        /* in below onel line code we have converted in two lines of code because we want to use
         that variable again and agin mean good readable programe*/

        //name.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        WebElement userName=name.findElement(By.id("ctl00_MainContent_username"));

        userName.sendKeys("Tester"); // this is because we can use username  again and agian


       WebElement password= name.findElement(By.id("ctl00_MainContent_password"));

       password.sendKeys("test");  // this is because we can  use it again and agian.

        WebElement button=name.findElement(By.id("ctl00_MainContent_login_button"));

        button.click(); // this is because we can use this code , because it is stored in a button variable.
    }
}
