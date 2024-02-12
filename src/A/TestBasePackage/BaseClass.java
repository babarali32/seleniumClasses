package A.TestBasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static void OpenBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver(); // if we say driver= null; then it will give error, browser is opening chrome
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public static void closeBrowser() {
        if (driver != null) { // this means if driver is not null then it will quiet the browser if driver is null then it will give error
            driver.quit(); // this mean browser closing chrome.
        }

    }
}