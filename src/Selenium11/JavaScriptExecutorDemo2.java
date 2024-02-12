package Selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/blackfriday?pf_rd_p=973f9715-2d37-49e4-b611-44ddc828a3c1&pf_rd_r=J165EPK7XJW43JSN2DFF&pd_rd_wg=hhIT4&pd_rd_w=jKc2l&content-id=amzn1.sym.973f9715-2d37-49e4-b611-44ddc828a3c1&ie=UTF8&pd_rd_r=246a6088-6145-4158-a33e-601626d66046");

        JavascriptExecutor ama=(JavascriptExecutor) driver;
        ama.executeScript("window.scrollBy(0,500)"); // scroll down.
        Thread.sleep(4000);
        ama.executeScript("window.scrollBy(0,-500)"); // back to zero position

        WebElement last=driver.findElement(By.className("navFooterBackToTopText"));
        ama.executeScript("arguments[0].scrollIntoView(true)",last);



        

    }
}
