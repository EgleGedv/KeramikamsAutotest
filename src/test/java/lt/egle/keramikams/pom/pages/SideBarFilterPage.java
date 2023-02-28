package lt.egle.keramikams.pom.pages;

public class SideBarFilterPage {

    public static void chooseCategoryInSideBarBOTZ() {
        Common.clickElement(Locator.SideBarFilterPage.buttonBotz);
    }

    public static void setPriceRange() {
        Common.slideElement(Locator.SideBarFilterPage.sliderPriceStart, -160, 0);
    }


    public static void scrollDownToSeePriceRangeSlider() {
        Common.scrollToElement(Locator.SideBarFilterPage.spanSideBarKaina);

    }
}
