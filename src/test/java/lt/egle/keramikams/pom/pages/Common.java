package lt.egle.keramikams.pom.pages;

import lt.egle.keramikams.pom.utils.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.*;

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

    public static List<Boolean> getSelectedStatusOfAllCheckboxes(By locator) {
        List<WebElement> elements = getElements(locator);
        List<Boolean> elementsStatuses = new ArrayList<>();

        for (WebElement element : elements) {
            elementsStatuses.add(element.isSelected());
        }
        return elementsStatuses;
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);

    }

    public static String getElementAttributeOutcome(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static boolean isAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
        } catch (NoAlertPresentException e) {
            return false;
        }
        return true;
    }

    public static void dismissAlert() {
        Driver.getDriver().switchTo().alert().dismiss();
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

    public static void scrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement Element = Driver.getDriver().findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", Element);

    }

//    public static void waitForThePageToLoadCompletely() {
//        Driver.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
//    }

    //StaleElementReferenceException
    public static void waitForTheElementToLoad(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class, ElementClickInterceptedException.class);

        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static void waitForUrlToBe(String url) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.urlToBe(url));

    }

    public static void doubleClickElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(getElement(locator));
        actions.perform();
    }

//    public static boolean xxx(By locator) {
//        do {
//            try {
//                Common.sleep(500);
//                Common.clickElement(locator);
//            } catch (ElementClickInterceptedException e) {
//                return false;
//            } catch (StaleElementReferenceException se) {
//                return false;
//            } catch (ElementNotInteractableException se) {
//                return false;
//            }
//            return true;
//        } while (false);
//    }
}
//
//        do{
//            try {
//                triangle = getTriangleDim();
//                bError=false;
//            } catch (Exception e){
//                System.out.println("You did not enter an integer, please enter an integer value");
//                // Don't do anything else in here: we will loop back to the beginning again and get new input!
//            }
//        }while (bError);



