package lt.egle.keramikams.pom.pages;

import lt.egle.keramikams.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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


    public static void chooseSortByPrice() {
        Common.selectOptionByValue(Locator.ItemFilter.buttonRikiavimas, "price");
    }

    public static void setDescendingDirection() {
        Common.clickElement(Locator.ItemFilter.arrowSetDescending);
    }

    public static List<Double> getPricesBeforeFilter() {
        return Common.getPricesBeforeFilter(Locator.ItemFilter.filterPrice);
    }


}
