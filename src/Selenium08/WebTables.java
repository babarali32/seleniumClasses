package Selenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTables {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();

            driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

           List<WebElement> rows= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

        System.out.println(rows.size());

        Iterator<WebElement> it= rows.iterator();
        while (it.hasNext()){

            WebElement element=it.next();
           String rowdata=element.getText();
            System.out.println(rowdata);
        }
        System.out.println("------------------------------------");

        List<WebElement> col=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        col.size();
        for (WebElement printcol:col
             ) {
            System.out.println(printcol.getText());
        }




    }}
