package lt.egle.keramikams.pom.pages;

import java.util.List;

public class SidebarFilterPage {

    public static void chooseCategoryInSideBarBOTZ() {
        Common.clickElement(Locator.SideBarFilterPage.buttonBotz);
    }

    public static void setPriceRangeToMax3Euro55ct() {
        Common.setSlideElement(Locator.SideBarFilterPage.divSliderPriceMax, -160,0);
    }

    public static void setPriceRangeToMax4Euro55ct() {
        Common.setSlideElement(Locator.SideBarFilterPage.divSliderPriceMax, -130,0);
    }

    public static void scrollDownToSeePriceRangeSlider() {
        Common.scrollToElement(Locator.SideBarFilterPage.buttonSideBarKaina);
    }

    public static String readFiltruojamaPagal() {
        return Common.getElementText(Locator.SideBarFilterPage.spanCurrentFilter);
    }

    public static List<Double> getFilteredPricesMax3_55() {
        return Common.getListPrices(Locator.SideBarFilterPage.filteredPricesMax3_55BOTZ);
    }

    public static List<Double> getFilteredPricesMax4_55() {
        Common.waitUntilPageCompletelyLoaded(10);
        return Common.getListPrices(Locator.SideBarFilterPage.filteredPricesMax4_55BOTZ);
    }

    public static boolean areAllPricesInThePriceRange1_55to3_55Euro(List<Double> list) {
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

    public static boolean areAllPricesInThePriceRange1_55to4_55Euro(List<Double> list) {
        int i = 0;
        while (i < list.size()) {
            Double x = list.get(i);
            if (x >= 1.55 && x <= 4.55)
                i++;
            else {
                return false;
            }
        }
        return true;
    }

    public static void clickOnDengiamumas() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.buttonSidebarDengiamumas);

    }

    public static void selectDengianti() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.checkboxDengianti);
    }

    public static void clickOnBlizgesioLygis() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.buttonSidebarBlizgesioLygis);

    }

    public static void selectBlizgus() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.checkboxBlizgus);
    }

    public static void clickOnGlazurosSavybes() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.buttonSidebarGlazurosSavybes);
    }

    public static void selectRekomenduojamaIndams() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.checkboxRekomenduojamaIndams);
    }


    public static void selectColour(String colour) {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.SideBarFilterPage.selectionByColour(colour));


    }

    public static String readNameFirstItem() {
        Common.waitUntilPageCompletelyLoaded(10);
        return Common.getElementText(Locator.SideBarFilterPage.firstItem);
    }
}
