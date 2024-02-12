package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01WebOrderTask {
    public static void main(String[] args) throws InterruptedException {


    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver name=new ChromeDriver();
        name.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        name.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        name.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        name.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(5000);
        String title=name.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("correct title");
        } else {
            System.out.println("wrong title");
        }
        name.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        name.close();








    }}
