package lt.egle.keramikams.pom.pages;

public class LoginPage {

    public static void typeEmail(String email) {
        Common.sendKeysToElement(Locator.Login.fieldElPastas, email);
    }

    public static void typePassword(String password) {
        Common.sendKeysToElement(Locator.Login.fieldSlaptazodis, password);
    }

    public static void clickLogIn() {
        Common.clickElement(Locator.Login.buttonPrisijungti);
    }

    public static void clickOnNuorodos() {
        Common.waitForElementToBePresent(Locator.Login.spanAtsijungti);
        Common.clickElement(Locator.CommonActions.buttonNuorodos);
    }

    public static String readFirstLineDropdownNuorodos() {
        Common.waitForElementToBePresent(Locator.Login.firstLineDropdownNuorodos);
        return Common.getElementText(Locator.Login.firstLineDropdownNuorodos);
    }

    public static String readErrorMessage() {
        return Common.getElementText(Locator.Login.errorMessage);
    }

    public static void clickButtonForMoreOptions() {
        Common.clickElement(Locator.Login.buttonCustomerMenu);
    }

    public static void clickManoPaskyra() {
        Common.clickElement(Locator.Login.buttonManoPaskyra);
    }
}
