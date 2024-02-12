package Selenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebElement user=driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester");
        WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("test");
        WebElement click=driver.findElement(By.xpath("//input[@value='Login']"));
        click.click();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        System.out.println(rows.size());
        System.out.println("----------------------------");
        for (int i=1; i<rows.size(); i++){  // i=1 in actual lecture i is one but i am putting 0.
           String printrows= rows.get(i).getText();
            System.out.println(printrows);
            if(printrows.contains("FamilyAlbum")){
                List<WebElement> check=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                check.get(i).click();  // this is inside the loop



            }
        }






    }

}
