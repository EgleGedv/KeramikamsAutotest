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
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void chooseSortByPrice() {
        Common.selectOptionByValue(Locator.ItemFilter.buttonRikiavimas, "price");
    }

    public static void setDescendingDirection() {
        Common.clickElement(Locator.ItemFilter.arrowSetDescending);
    }

    public static List<Double> getPricesBeforeFilter() {
        return Common.getListPrices(Locator.ItemFilter.filterPrice);

    }

    public static List<Double> getPricesAfterFilter() {
        return Common.getListPrices(Locator.ItemFilter.filterPrice);
    }
}
