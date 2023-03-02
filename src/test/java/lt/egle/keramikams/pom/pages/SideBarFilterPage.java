package lt.egle.keramikams.pom.pages;

public class SideBarFilterPage {

    public static void chooseCategoryInSideBarBOTZ() {
        Common.clickElement(Locator.SideBarFilterPage.buttonBotz);
    }

    public static void setPriceRangeFrom1Euro55ctTo4Euro55ct() {
        Common.slideElement(Locator.SideBarFilterPage.sliderPriceStart, -130, 0);
    }

    public static void scrollDownToSeePriceRangeSlider() {
        Common.scrollToElement(Locator.SideBarFilterPage.buttonSideBarKaina);
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

//    public static void selectFromDengiamumas(String typeOfDengiamumas) {
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
}
