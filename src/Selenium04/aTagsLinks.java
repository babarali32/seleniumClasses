package Selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class aTagsLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        List<WebElement> all = driver.findElements(By.tagName("a"));
        System.out.println(all.size());

        for (WebElement links : all
        ) {
            String num = links.getText();
            String att = links.getAttribute("href");
            // System.out.println(links.getText());
            if (!num.isEmpty()) {
                //System.out.println(num);
                System.out.println(num + " ---- " + att);
            } /*else {
                System.out.println("element is empty");*/
        }
    }
}