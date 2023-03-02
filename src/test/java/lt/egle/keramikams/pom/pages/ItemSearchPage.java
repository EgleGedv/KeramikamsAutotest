package lt.egle.keramikams.pom.pages;

public class ItemSearchPage {

    public static String readMessageNotice() {
        return Common.getElementText(Locator.ItemSearch.textMessageNotice);
    }

    public static String getNameFirstGivenItem() {
        return Common.getElementText(Locator.ItemSearch.textFirstItemInList);
    }
}
