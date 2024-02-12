import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickDoubleClickActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions click=new Actions(driver);
        WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        click.contextClick(rightclick).perform();
        WebElement editclick=driver.findElement(By.xpath("//span[text()='Edit']"));
        click.click(editclick).perform();

        Alert alr=driver.switchTo().alert();
        alr.accept();

        WebElement doubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        click.doubleClick(doubleclick).perform();
        String text=alr.getText();
        System.out.println(text);
        alr.accept();




    }
}
