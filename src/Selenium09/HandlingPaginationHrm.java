package Selenium09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingPaginationHrm {
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

        WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
        pim.click();

        WebElement id=driver.findElement(By.id("menu_pim_addEmployee"));
        id.click();
        WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
       firstname.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa123");

        //WebElement lastname=driver.findElement(By.id("lastName"));
        WebElement lasnme=driver.findElement(By.xpath("//input[@id='lastName']"));
        lasnme.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

        WebElement idnumber=driver.findElement(By.id("employeeId"));
        String getvalueid=idnumber.getAttribute("value");

        WebElement save=driver.findElement(By.id("btnSave"));
        save.click();
//
        WebElement list=driver.findElement(By.id("menu_pim_viewEmployeeList"));
        list.click();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        for(int i=0; i<rows.size(); i++) {
            String printallRows = rows.get(i).getText();
           // WebElement nextbutton=driver.findElement(By.linkText("Next"));

//
//
//        boolean flag=true;
//        while (flag){
//            List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
//             for(int i=0; i<rows.size(); i++) {
//             String printallRows = rows.get(i).getText();
//            if (rows.contains(getvalueid)) {
//                flag=false;
//                WebElement checkboxsingle = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]"));
//                checkboxsingle.click();
//                WebElement deltebutton = driver.findElement(By.id("btnDelete"));
//                deltebutton.click();
//                WebElement alert = driver.findElement(By.id("dialogDeleteBtn"));
//                alert.click();
//                break;
//            }
//
//        }
//
       } //WebElement nextbutton=driver.findElement(By.linkText("Next"));
//        if(flag){
//        nextbutton.click();}













    }
}
