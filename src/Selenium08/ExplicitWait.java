package Selenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        WebElement clck=driver.findElement(By.id("save"));
        clck.click();
        // wed driver wait is a class in selenium.
        WebDriverWait wait=new WebDriverWait(driver,20); // two arguments , one is object of driver and other is time.
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[contains(text() ,'First Name ')]")));


        WebElement firstName=driver.findElement(By.xpath("//p[contains(text() ,'First Name ')]"));
        String text=firstName.getText();
        System.out.println(text);

    }
}
