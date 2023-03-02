package lt.egle.keramikams.pom.pages;

public class HomePage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/");
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locator.CommonActions.buttonCookiesSutinku);
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void clickOnNuorodos() {
        Common.waitForElementToBePresent(Locator.CommonActions.buttonNuorodos);
        Common.clickElement(Locator.CommonActions.buttonNuorodos);
    }

    public static void clickOnPrisijungti() {
        Common.clickElement(Locator.Home.wordClickablePrisijungti);
    }

    public static void typeItemToSearchFor(String item) {
        Common.sendKeysToElement(Locator.Home.inputSearch, item);
    }

    public static void selectCategoryFromListVisosKategorijos(String category) {
        Common.clickElement(
                Locator.Home.inputByTextInCategory(category)
        );
    }

    public static void clickOnMagnifierToSearch() {
        Common.waitForElementToBeClickable(Locator.Home.iconMagnifier);
        Common.clickElement(Locator.Home.iconMagnifier);
    }

    public static void mouseHoverOnPrekiuKatalogas() {
        Common.mouseHoverOnElement(Locator.Home.buttonPrekiuKatalogas);
    }

    public static void selectFromPrekiuKatalogas(String category) {
        Common.clickElement(Locator.Home.inputByTitle(category));
    }
}
