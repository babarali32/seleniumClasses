package Selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
       WebElement option=driver.findElement(By.id("multi-select"));
        Select drop=new Select(option);
        boolean multi=drop.isMultiple();
          System.out.println(multi);
          if(multi){
            List<WebElement> all=drop.getOptions();
              System.out.println(all.size());
            for(WebElement sum:all){
                String one=sum.getText();
              drop.selectByVisibleText(one);
              Thread.sleep(2000);

            }}
            drop.deselectByIndex(5);
          drop.deselectAll();

    }
}
