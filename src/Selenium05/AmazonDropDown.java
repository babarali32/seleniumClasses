package Selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDropDown {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/?&tag=googleglobalp-20&ref=pd_sl_7nnedyywlk_e&adgrpid=82342659060&hvpone=&hvptwo=&hvadid=585475370855&hvpos=&hvnetw=g&hvrand=17999334967332839241&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9060981&hvtargid=kwd-10573980&hydadcr=2246_13468515");
       WebElement option= driver.findElement(By.id("searchDropdownBox"));
        Select alloption=new Select(option);
        List<WebElement> all=alloption.getOptions();
       
        System.out.println(all.size());
        for(WebElement once:all){
            String val=once.getText();
            System.out.println(val);

        }






    }
}
