package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.ItemFilterPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemFilterTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setup() {
        ItemFilterPage.open();
    }

    @Test
    public void testSortByPriceLowestToHighestPorcelianas(){

        ItemFilterPage.sleep();
        ItemFilterPage.acceptCookies();
        ItemFilterPage.capturePricesBeforeFilter();



    }
}
