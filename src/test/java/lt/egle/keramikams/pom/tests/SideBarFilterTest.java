package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.HomePage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;

public class SideBarFilterTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        HomePage.open();
    }
}
