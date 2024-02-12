package Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class newCalendarHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.delta.com/apac/en");
        WebElement clickoncalender=driver.findElement(By.xpath("//span[@class='calenderDepartSpan']"));
        clickoncalender.click();

        WebElement forwardclick=driver.findElement(By.xpath("//span[text()='Next']"));
        forwardclick.click();
        WebElement november=driver.findElement(By.className("dl-datepicker-month-0"));

        String textOfmonth=november.getText();
        while (!textOfmonth.equals("March")){
            november.click();
            textOfmonth=november.getText();

        }
        List<WebElement> dates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement selectdate:dates
             ) {
            String getdate=selectdate.getText();
            if(getdate.equals("20")){
                selectdate.click();
            }
        }
        WebElement returnn=driver.findElement(By.className("dl-datepicker-month-1"));
        String textreturn=returnn.getText();
        while (!textreturn.equals("June")){
            returnn.click();
            textreturn=returnn.getText();
        }
        List<WebElement> secondTable=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement other:secondTable
             ) {
           String nextone= other.getText();
           if(nextone.equals("22")){
               other.click();
           }

        }









    }

}
