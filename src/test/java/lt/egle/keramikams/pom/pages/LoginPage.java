package lt.egle.keramikams.pom.pages;

public class LoginPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/");
    }


    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void acceptCookies() {
        Common.waitForElementToBeVisible(Locator.CommonActions.buttonCookiesSutinku);
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void clickOnNuorodos() {
        LoginPage.sleep(3000); //waiting for a new page to load
        Common.clickElement(Locator.CommonActions.buttonNuorodos);
    }

    public static void clickOnPrisijungti() {
        Common.clickElement(Locator.Login.wordClickablePrisijungti);
    }

    public static void typeEmail(String email) {
        Common.sendKeysToElement(Locator.Login.fieldElPastas, email);
    }

    public static void typePassword(String password) {
        Common.sendKeysToElement(Locator.Login.fieldSlaptazodis, password);
    }

    public static void clickLogIn() {
        Common.clickElement(Locator.Login.buttonPrisijungti);
    }

    public static String readFirstLineDropdownNuorodos() {
        Common.waitForElementToBeVisible(Locator.Login.firstLineDropdownNuorodos);
        return Common.getElementText(Locator.Login.firstLineDropdownNuorodos);
    }

    public static String readErrorMessage() {
        return Common.getElementText(Locator.Login.errorMessage);
    }
}
