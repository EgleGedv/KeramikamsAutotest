package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.LoginPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    // LoginPositive fails when running with testng because of reCaptcha, please run it separately

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

        LoginPage.sleep(3000);
        LoginPage.acceptCookies();
        LoginPage.clickOnNuorodos();
        LoginPage.clickOnPrisijungti();
        LoginPage.typeEmail(email);
        LoginPage.typePassword(password);
        LoginPage.clickLogIn();
        LoginPage.sleep(3000); //before we can check for the necessary phrase, we need to wait a bit for the login page to load
        LoginPage.clickOnNuorodos();

        actualResult = LoginPage.readFirstLineDropdownNuorodos();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }

    @Test
    public void testNegativeLogin() {

        String expectedResult = "Neteisingas";
        String actualResult;

        String fakeEmail = "Lalala@msn.com";
        String fakePassword = "Lalala123";
        LoginPage.sleep(3000);
        LoginPage.acceptCookies();
        LoginPage.clickOnNuorodos();
        LoginPage.clickOnPrisijungti();
        LoginPage.typeEmail(fakeEmail);
        LoginPage.typePassword(fakePassword);
        LoginPage.clickLogIn();

        actualResult = LoginPage.readErrorMessage();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }
}
