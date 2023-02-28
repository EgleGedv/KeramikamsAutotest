package lt.egle.keramikams.pom.pages;

import java.util.List;

public class SortItemsPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/prekiu-katalogas/molio-mases/porcelianas");
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locator.CommonActions.buttonCookiesSutinku);
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void chooseSortByPrice() {
        Common.waitForElementToBeClickable(Locator.ItemFilter.buttonRikiavimas);
        Common.selectOptionByValue(Locator.ItemFilter.buttonRikiavimas, "price");
    }

    public static void setDescendingDirection() {
        Common.clickElement(Locator.ItemFilter.arrowSetDescending);
    }

    public static List<Double> getPricesBeforeFilter() {
        return Common.getListPrices(Locator.ItemFilter.filterPrice);

    }

    public static List<Double> getPricesAfterFilter() {
        Common.waitForElementToBeVisible(Locator.ItemFilter.filterPrice);
        return Common.getListPrices(Locator.ItemFilter.filterPrice);
    }
}
