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
        LoginPage.sleep(5000); //waiting for a new page to load
        Common.clickElement(Locator.CommonActions.buttonNuorodos);
    }

    public static void clickOnPrisijungti() {
        Common.clickElement(Locator.Login.wordClickablePrisijungti);
    }
}
