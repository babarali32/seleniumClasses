package javaClassPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cucumberphotolink {

        public  static  WebDriver driver;
        public static String photopath="G:\\6 Cucumber\\excelphotos\\two.jpg";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();     // it will open the browser , but it will not navigate.
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        driver.manage().window().maximize();
        WebElement username1= driver.findElement(By.id("txtUsername"));
        username1.sendKeys("Admin");
        WebElement pas1=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pas1.sendKeys("Hum@nhrm123");
        WebElement login=driver.findElement(By.id("btnLogin"));
        login.click();
        WebElement pimclick= driver.findElement(By.id("menu_pim_viewPimModule"));
        pimclick.click();
        WebElement addemployebutton=driver.findElement(By.id("menu_pim_addEmployee"));
        addemployebutton.click();
        WebElement firstname1=driver.findElement(By.id("firstName"));
        firstname1.sendKeys("abc123");
        WebElement midlename2=driver.findElement(By.id("middleName"));
        midlename2.sendKeys("abcxyz");
        WebElement lastname3=driver.findElement(By.id("lastName"));
        lastname3.sendKeys("abc123xyr");
        WebElement attribute=driver.findElement(By.xpath("//input[@id='employeeId']"));
        String needvalue=attribute.getAttribute("name");

        System.out.println(needvalue);
//        WebElement photo=driver.findElement(By.xpath("//input[@id='photofile']"));
//        photo.sendKeys("G:\\6 Cucumber\\excelphotos\\two.jpg");



    }
}
