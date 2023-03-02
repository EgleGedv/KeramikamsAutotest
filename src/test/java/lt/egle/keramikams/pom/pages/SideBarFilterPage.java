package lt.egle.keramikams.pom.pages;

import java.util.List;

public class SideBarFilterPage {

    public static void chooseCategoryInSideBarBOTZ() {
        Common.clickElement(Locator.SideBarFilterPage.buttonBotz);
    }

    public static void setPriceRangeFrom1Euro55ctTo3Euro55ct() {
        Common.slideElement(Locator.SideBarFilterPage.sliderPriceStart, -160, 0);
    }

    public static void scrollDownToSeePriceRangeSlider() {
        Common.scrollToElement(Locator.SideBarFilterPage.buttonSideBarKaina);
    }

    public static String readCurrentFilteredValue() {
        return Common.getElementText(Locator.SideBarFilterPage.spanCurrentFilter);
    }

    public static void clickOnDengiamumas() {
//        Common.waitForElementToBeClickable(Locator.SideBarFilterPage.buttonSideBarDengiamumas);
//        Common.isElementLoaded(Locator.SideBarFilterPage.filterOptionDengiamumas);
//        Common.waitForElementToBeClickable(Locator.SideBarFilterPage.itemBotz9894);
//        Common.clickElement(Locator.SideBarFilterPage.filterOptionDengiamumas);
    }

    public static void selectDengianti() {
        Common.clickElement(Locator.SideBarFilterPage.checkboxDengianti);
    }

    public static void sleep() {
        Common.sleep(5000);
    }

//        public static void selectFromDengiamumas(String typeOfDengiamumas) {
//        Common.clickElement(Locator.SideBarFilterPage.checkboxDengiamumasByType(typeOfDengiamumas));
//    }

    public static void scrollDownToSeeBlizgesioLygis() {
        Common.waitForElementToBePresent(Locator.SideBarFilterPage.spanFilterCurrentDengiamumas);
        Common.scrollToElement(Locator.SideBarFilterPage.buttonSideBarBlizgesioLygis);
    }

    public static void selectFromBlizgesioLygis(String typeOfBlizgesioLygis) {
        Common.waitForElementToBePresent(Locator.SideBarFilterPage.spanFilterValueDengiamumas);
        Common.clickElement(Locator.SideBarFilterPage.checkboxBlizgesioLygisByType(typeOfBlizgesioLygis));
    }

    public static List<Double> getFilteredPrices() {
        return Common.getListPrices(Locator.SideBarFilterPage.filteredPricesBOTZ);
    }

    public static boolean areAllPricesInThePriceRangeChosen(List<Double> list) {
        int i=0;
        while (i< list.size()){
            Double x = list.get(i);
            if ( x >= 1.55 && x <= 3.55)
                i++;
            else {
                return false;
            }}
        return true;
    }}
