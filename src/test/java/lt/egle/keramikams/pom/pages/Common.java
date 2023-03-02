package lt.egle.keramikams.pom.pages;

import lt.egle.keramikams.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static List<Double> getListPrices(By locator) {

        List<WebElement> filterPrice = getPrices(locator);
        List<String> filterPriceList = new ArrayList<>();

        for (WebElement p : filterPrice) {
            filterPriceList.add(
                    (p.getText().replace("€", " ")));
        }

        List<Double> filterPriceListDouble = new ArrayList<>();
        for (String x : filterPriceList) {
            filterPriceListDouble.add(Double.parseDouble(x.replace(",", ".")));
        }
        return filterPriceListDouble;
    }

    private static List<WebElement> getPrices(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBePresent(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void selectAllText(By locator) {
        getElement(locator).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForTextToBePresentInElementLocated(By locator, String text) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public static void mouseHoverOnElement(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(locator));
        actions.perform();
    }

    public static void slideElement(By locator, int xOffSet, int yOffSet) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement slider = getElement(locator);
        actions.dragAndDropBy(slider, xOffSet, yOffSet);
        actions.perform();
    }

    public static void waitUntilPageCompletelyLoaded(int seconds) {
        JavascriptExecutor j = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i <= seconds*2; i++) {
            sleep(seconds*1000/2);
            if (j.executeScript("return document.readyState").toString().equals("complete")) break;
        }
    }

    public static void scrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement Element = Driver.getDriver().findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public static void setSlideElement(By locator, int xOffSet, int yOffSet) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions
                .dragAndDropBy(element, xOffSet, yOffSet)
                .build()
                .perform();
    }
}




