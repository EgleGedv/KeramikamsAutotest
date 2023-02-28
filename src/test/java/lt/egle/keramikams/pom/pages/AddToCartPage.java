package lt.egle.keramikams.pom.pages;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
    public static void open() {
        Common.openUrl("https://keramikams.lt/catalogsearch/result/?q=Raudona+riebi+molio+mas%C4%97+");
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locator.CommonActions.buttonCookiesSutinku);
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void clickButtonAddToCart() {
        Common.clickElement(Locator.AddToCart.buttonIKrepseliRaudonaRiebiMolioMase);
    }

    public static void selectTextGivenValueQuantity20Kg() {
        Common.selectAllText(Locator.AddToCart.fieldQuantity20Kg);
    }

    public static void typeNewValueQuantity20Kg(String quantity20Kg) {
        Common.sendKeysToElement(Locator.AddToCart.fieldQuantity20Kg, quantity20Kg);
    }

    public static void selectTextGivenValueQuantity5Kg() {
        Common.selectAllText(Locator.AddToCart.fieldQuantity5Kg);
    }

    public static void typeNewValueQuantity5Kg(String quantity5Kg) {
        Common.sendKeysToElement(Locator.AddToCart.fieldQuantity5Kg, quantity5Kg);
    }

    public static void clickButtonSubmitAddToCart() {

        Common.clickElement(Locator.AddToCart.buttonIKrepseli);
    }

    public static String readValueNumberOfItemsInBasket() {
        return Common.getElementText(Locator.AddToCart.numberofItemsinBasket);
    }
}
