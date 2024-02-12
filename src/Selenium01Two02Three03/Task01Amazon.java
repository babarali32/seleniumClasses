package Selenium01Two02Three03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01Amazon {
    public static void main(String[] args) {

            System.setProperty ("webdriver.chrome.driver","Drivers/chromedriver.exe");

            WebDriver one=new ChromeDriver();       // it will open the browser , but it will not navigate.
            one.get("https://www.youtube.com/");
                String urlam=one.getCurrentUrl();
                String titleama= one.getTitle();
        System.out.println(urlam);
        System.out.println(titleama);
        one.close();


}}

