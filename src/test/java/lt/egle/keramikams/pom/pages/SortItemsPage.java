package lt.egle.keramikams.pom.pages;

import java.util.List;

public class SortItemsPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/prekiu-katalogas/molio-mases/porcelianas");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locator.CommonActions.buttonCookiesSutinku);
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void chooseSortByPrice() {
        Common.waitForElementToBeClickable(Locator.SortItems.buttonRikiavimas);
        Common.selectOptionByValue(Locator.SortItems.buttonRikiavimas, "price");
    }

    public static void setDescendingDirection() {
        Common.sleep(5000);
        //Common.waitForElementToBeClickable(Locator.SortItems.spanSecondItem);
        Common.clickElement(Locator.SortItems.arrowSetDescending);
    }

    public static List<Double> getPricesBeforeSorting() {
        return Common.getListPrices(Locator.SortItems.sorterPrice);

    }

    public static List<Double> getPricesAfterSorting() {
        Common.waitForElementToBePresent(Locator.SortItems.spanThirdItem);
        return Common.getListPrices(Locator.SortItems.sorterPrice);
    }
}
