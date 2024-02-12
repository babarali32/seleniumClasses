package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
public class commonMethods {
            public static WebDriver driver;
            public void openBrowser() throws InterruptedException {
                configReader.read("config/config.properties");
                switch (configReader.getvalue("browser")) {
                    case "chrome":
                        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        System.out.println("browser is not available");
                        break;
                    default:
                        throw new RuntimeException("invalid brower name");
                }
                    driver.get(configReader.getvalue("url"));
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

                }
         public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
}
}
