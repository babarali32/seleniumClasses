package Selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TaskEbayCatagories {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement options=driver.findElement(By.id("gh-cat"));
        Select all=new Select(options);

         List<WebElement>  printoption= all.getOptions();

        int val= printoption.size();
        System.out.println(val);
        System.out.println("------------------------");
        for (WebElement text:printoption
             ) {
            String two=text.getText();
            if(two.equals("Computers/Tablets & Networking")) {
                all.selectByVisibleText("Computers/Tablets & Networking");
            }
            System.out.println(two);
            Thread.sleep(2000);
        }
            driver.findElement(By.cssSelector("input[class='btn btn-prim gh-spr']")).click();
              System.out.println("------------------------------");
           /* WebElement disp=options.findElement(By.xpath("//span[text()='Computers & Accessories']"));
            boolean isdiplayed= disp.isDisplayed();
            System.out.println(isdiplayed);*/

          }

    }


