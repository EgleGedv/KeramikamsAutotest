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
        SortItemsPage.acceptCookies();
    }

    @Test
    public void testSortByPriceLowestToHighestItemsPorcelianas() {

        List<Double> expectedResult = new ArrayList<>(SortItemsPage.getPricesBeforeFilter());

        Collections.sort(expectedResult, Collections.reverseOrder());

        SortItemsPage.chooseSortByPrice();
        SortItemsPage.sleep(3000);
        SortItemsPage.setDescendingDirection();
        SortItemsPage.sleep(3000); //waiting to load new prices, WebDriverWait does not work in this and above cases

        List<Double> actualResult = new ArrayList<>(SortItemsPage.getPricesAfterFilter());

        System.out.println(actualResult);
        System.out.println(expectedResult);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
