package admifast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class clubShrk {
    public static WebDriver driver = null;
    public static String url = "http://shrk.club";

    @BeforeClass

    public void beforeAction ()throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        driver = new ChromeDriver();

    }

    @Test
        public void test() throws InterruptedException {
        for (int i=0; i<=50000; i++) {
            driver.navigate().to(url);
            System.out.println("url1");
            Thread.sleep(60000);
        }

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
    public static String getUrl(){
        return url;
    }
}

