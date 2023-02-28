package lt.egle.keramikams.pom.pages;

public class ItemSearchPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locator.CommonActions.buttonCookiesSutinku);
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void typeItemToSearchFor(String item) {
        Common.sendKeysToElement(Locator.ItemSearch.inputSearch, item);
    }

    public static void clickOnMagnifierToSearch() {
        Common.waitForElementToBeClickable(Locator.ItemSearch.iconSearch);
        Common.clickElement(Locator.ItemSearch.iconSearch);
    }

    public static String getNameFirstGivenItem() {
        return Common.getElementText(Locator.ItemSearch.textFirstItemInList);
    }

    public static String readMessageNotice() {

        return Common.getElementText(Locator.ItemSearch.textMessageNotice);
    }

    public static void selectFromListMolioMases() {
        Common.clickElement(Locator.ItemSearch.dropDownKategorijosMolioMases);
    }
}
