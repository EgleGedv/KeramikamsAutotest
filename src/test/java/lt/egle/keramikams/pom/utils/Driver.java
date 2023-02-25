package lt.egle.keramikams.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    //   private static WebDriver driver; <- paleidziant iprastai
    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();


    public static void setDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized");
        //      chromeOptions.addArguments("--headless");
        driverThread.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    public static WebDriver getDriver() { //getter privaciam kintamajam paimti
        return driverThread.get();
    }

    public static void closeDriver() {
        driverThread.get().quit();
        driverThread.remove();
    }

}
