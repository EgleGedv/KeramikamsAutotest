package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.Locator;
import lt.egle.keramikams.pom.pages.LoginPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        LoginPage.open();
    }

    @Test

    public void testPositiveLogin() {

        String expectedResult = "SVEIKI ATVYKĘ, COCO COCONUT!";
        String actualResult;

        String email = "Cocococonut144@gmail.com";
        String password = "Coconut123";

        LoginPage.sleep();
        LoginPage.acceptCookies();
        LoginPage.clickOnNuorodos();
        LoginPage.clickOnPrisijungti();
        LoginPage.typeEmail(email);
        LoginPage.typePassword(password);
        LoginPage.clickLogIn();
        LoginPage.sleep(); //wait a bit for the login page to load, before we check for the necessary phrase
        LoginPage.clickOnNuorodos();

        actualResult = LoginPage.readFirstLineDropdownNuorodos();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));


    }


}
