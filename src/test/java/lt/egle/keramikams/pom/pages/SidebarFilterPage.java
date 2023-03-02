package lt.egle.keramikams.pom.pages;

import java.util.List;

public class SidebarFilterPage {

    public static void chooseCategoryInSideBarBOTZ() {
        Common.clickElement(Locator.SideBarFilterPage.buttonBotz);
    }

    public static void setPriceRangeFrom1Euro55ctTo3Euro55ct() {
        Common.slideElement(Locator.SideBarFilterPage.sliderPriceStart, -160, 0);
    }

    public static void scrollDownToSeePriceRangeSlider() {
        Common.scrollToElement(Locator.SideBarFilterPage.buttonSideBarKaina);
    }

    public static String readFiltruojamaPagal() {
        return Common.getElementText(Locator.SideBarFilterPage.spanCurrentFilter);
    }

    public static List<Double> getFilteredPrices() {
        return Common.getListPrices(Locator.SideBarFilterPage.filteredPricesBOTZ);
    }

    public static boolean areAllPricesInThePriceRangeChosen(List<Double> list) {
        int i = 0;
        while (i < list.size()) {
            Double x = list.get(i);
            if (x >= 1.55 && x <= 3.55)
                i++;
            else {
                return false;
            }
        }
        return true;
    }
}
