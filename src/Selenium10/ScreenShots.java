//package Selenium10;
//
//import C.utilsPackage.CommonMethods;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//
//public class ScreenShots {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        WebDriver name=new ChromeDriver();
//        name.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//        WebElement userName=name.findElement(By.id("ctl00_MainContent_username"));
//        userName.sendKeys("Tester", Keys.TAB);
//        WebElement password= name.findElement(By.id("ctl00_MainContent_password"));
//        password.sendKeys("test",Keys.ENTER);
//
//        TakesScreenshot  photo=(TakesScreenshot) CommonMethods.driver; //
//
//        File source=photo.getScreenshotAs(OutputType.FILE); // i am getting a ss of this file type by using the object of screen shot intterface
//
//        try {
//            FileUtils.copyFile(source,new File("Screenshots/bearSoftware/loginfile.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
