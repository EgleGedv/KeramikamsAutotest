package lt.egle.keramikams.pom.pages;

public class LoginPage {

    public static void open() {
        Common.openUrl("https://keramikams.lt/");
    }


    public static void sleep() {
        Common.sleep(8000);
    }

    public static void acceptCookies() {
        Common.clickElement(Locator.CommonActions.buttonCookiesSutinku);
    }

    public static void clickOnNuorodos() {
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
        return Common.getElementText(Locator.Login.firstLineDropdownNuorodos);
    }

    public static String readErrorMessage() {
        return Common.getElementText(Locator.Login.errorMessage);
    }
}
