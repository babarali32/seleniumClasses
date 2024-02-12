package Selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement buttonisEnable=driver.findElement(By.cssSelector("input[value='5 - 15']"));

           boolean uncheck=buttonisEnable.isEnabled();
        System.out.println(uncheck);

        if(uncheck=buttonisEnable.isEnabled()){
            System.out.println("buttion is enabled ");
        } else {
            System.out.println(" button is checked already ");
        }
        System.out.println("----------------------------");
            // now check that is button dispayed or not
              boolean isdiplay = buttonisEnable.isDisplayed();
        if(isdiplay = buttonisEnable.isDisplayed()){
            System.out.println(isdiplay);}
        System.out.println("----------------------------");
               boolean selectornot= buttonisEnable.isSelected();
        System.out.println("is button selected "+selectornot);
        buttonisEnable.click();
        selectornot= buttonisEnable.isSelected();// this is re assigning the value

        System.out.println("is buttion now selected "+selectornot);


}}
