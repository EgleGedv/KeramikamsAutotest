package lt.egle.keramikams.pom.pages;

public class ItemSearchPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/");
    }

    public static void sleep() {
        Common.sleep(5000);
    }

    public static void acceptCookies() {
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void typeItemToSearchFor(String item) {
        Common.sendKeysToElement(Locator.ItemSearch.inputSearch, item);
    }

    public static void clickOnMagnifierToSearch() {
        Common.clickElement(Locator.ItemSearch.iconSearch);
    }

    public static String getNameFirstGivenItem() {
        return Common.getElementText(Locator.ItemSearch.textFirstItemGiven);
    }
}
