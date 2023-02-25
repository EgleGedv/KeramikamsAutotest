package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.LoginPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        LoginPage.open();
    }


}
