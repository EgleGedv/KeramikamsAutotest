package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.SortItemsPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortItemsTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setup() {
        SortItemsPage.open();
    }

    @Test
    public void testSortByPriceLowestToHighestItemsPorcelianas() {

        SortItemsPage.sleep(3000);
        SortItemsPage.acceptCookies();

        List<Double> expectedResult = new ArrayList<>(SortItemsPage.getPricesBeforeFilter());
        Collections.sort(expectedResult, Collections.reverseOrder());

        SortItemsPage.sleep(3000);
        SortItemsPage.chooseSortByPrice();
        SortItemsPage.sleep(3000);
        SortItemsPage.setDescendingDirection();
        SortItemsPage.sleep(3000);

        List<Double> actualResult = new ArrayList<>(SortItemsPage.getPricesAfterFilter());

        System.out.println(actualResult);
        System.out.println(expectedResult);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
