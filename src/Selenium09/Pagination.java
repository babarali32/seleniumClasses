package Selenium09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Pagination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-pagination-demo.php");
        List<WebElement> table=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement button=driver.findElement(By.xpath("//a[@class='next_link']"));

        boolean flag=true;
        while (flag) {
            for (WebElement rows : table) {
                String print = rows.getText();
                if(print.contains("Brad Jill")){
                System.out.println(print);
                flag=false;
                break;
            }
            }
        }  if(flag){
            button.click();
        }
    }

}
