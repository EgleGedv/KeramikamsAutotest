package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.ItemFilterPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;

public class ItemFilterTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setup() {
        ItemFilterPage.open();
    }
}
