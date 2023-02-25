package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.AddToCartPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;

public class AddToCartTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setup() {
        AddToCartPage.open();
    }

}
