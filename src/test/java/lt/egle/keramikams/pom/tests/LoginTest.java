package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.HomePage;
import lt.egle.keramikams.pom.pages.LoginPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setup() {
        HomePage.open();
        HomePage.acceptCookies();
        HomePage.clickOnNuorodos();
        HomePage.clickOnPrisijungti();
    }

    //please run testPositiveLogin separately and only by itself, otherwise it will not work because of reCaptcha
    @Test
    public void testPositiveLogin() {

        String expectedResult = "SVEIKI ATVYKĘ, COCO COCONUT!";
        String actualResult;

        String email = "Cocococonut144@gmail.com";
        String password = "Coconut123";

        LoginPage.typeEmail(email);
        LoginPage.typePassword(password);
        LoginPage.clickLogIn();
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

        LoginPage.typeEmail(fakeEmail);
        LoginPage.typePassword(fakePassword);
        LoginPage.clickLogIn();

        actualResult = LoginPage.readErrorMessage();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }
}
