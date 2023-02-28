package lt.egle.keramikams.pom.pages;

public class SideBarFilterPage {

    public static void chooseCategoryInSideBarBOTZ() {
        Common.clickElement(Locator.SideBarFilterPage.buttonBotz);
    }

    public static void setPriceRangeFrom1Euro55ctTo4Euro55ct() {
        Common.slideElement(Locator.SideBarFilterPage.sliderPriceStart, -130, 0);
    }


    public static void scrollDownToSeePriceRangeSlider() {
        Common.scrollToElement(Locator.SideBarFilterPage.spanSideBarKaina);

    }

    public static void scrollDownToSeeDengiamumas() {
        Common.waitForElementToBeVisible(Locator.SideBarFilterPage.spanFilterValue);
        Common.scrollToElement(Locator.SideBarFilterPage.spanSideBarDengiamumas);
    }

    public static void selectDengiamumas(String text) {
        Common.clickElement(Locator.SideBarFilterPage.checkboxDengiamumasByName(text));
    }
}
