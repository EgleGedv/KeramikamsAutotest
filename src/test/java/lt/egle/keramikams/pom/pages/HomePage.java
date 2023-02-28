package lt.egle.keramikams.pom.pages;

import org.openqa.selenium.By;

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

        Common.clickElement(Locator.Login.wordClickablePrisijungti);
    }

    public static void typeItemToSearchFor(String item) {
        Common.sendKeysToElement(Locator.Homepage.inputSearch, item);
    }

    public static void selectCategoryFromList(String category) {
        Common.clickElement(
                Locator.Homepage.inputByTextInCategory(category)
        );
    }

    public static void clickOnMagnifierToSearch() {
        Common.waitForElementToBeClickable(Locator.Homepage.iconMagnifier);
        Common.clickElement(Locator.Homepage.iconMagnifier);
    }


}
