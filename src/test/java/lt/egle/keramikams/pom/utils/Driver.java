package lt.egle.keramikams.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    public static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static void setDriver() {

        // WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        // WebDriverManager.chromedriver().clearResolutionCache().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--force-device-scale-factor=0.65");
        chromeOptions.addArguments("--remote-allow-origins=*");

        driverThread.set(new ChromeDriver(chromeOptions));
        driverThread.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public static WebDriver getDriver() {
        return driverThread.get();
    }

    public static void closeDriver() {
        driverThread.get().quit();
        driverThread.remove();
    }
}
