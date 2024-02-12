package Selenium09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement clickbutton=driver.findElement(By.id("btnLogin"));
        clickbutton.click();
        WebElement leave=driver.findElement(By.xpath("//b[text()='Leave']"));
        leave.click();
        WebElement calander=driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        calander.click();
        WebElement month=driver.findElement(By.className("ui-datepicker-month"));
        Select monthall=new Select(month);
        monthall.selectByVisibleText("Nov");
        List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement dates:date
             ) {
            String val=dates.getText();
            if(val.equals("17")){
                dates.click();
                break;
            }
        }
    }
}
