package lt.egle.keramikams.pom.pages;

public class ItemFilterPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/prekiu-katalogas/molio-mases/porcelianas");
    }

    public static void sleep() {
        Common.sleep(5000);
    }

    public static void acceptCookies() {
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }


    public static void capturePricesBeforeFilter() {
        Common.getPricesBeforeFilter(Locator.ItemFilter.spanKaina);
    }

    public static void chooseSortByPrice() {
        Common.selectOptionByValue(Locator.ItemFilter.buttonRikiavimas, "price");
    }
}
