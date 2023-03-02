package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.HomePage;
import lt.egle.keramikams.pom.pages.SidebarFilterPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SidebarFilterTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        HomePage.open();
        HomePage.acceptCookies();
        HomePage.mouseHoverOnPrekiuKatalogas();
        HomePage.selectFromPrekiuKatalogas("Vokiška glazūra");
    }

    @Test
    public void testSideBarFiltruojamaPagalKainaLabelAppears_1Euro55ctTo3Euro55ct_BOTZ() {

        String expectedResult = "1,55 € - 3,55 €";
        String actualResult;

        SidebarFilterPage.chooseCategoryInSideBarBOTZ();
        SidebarFilterPage.scrollDownToSeePriceRangeSlider();
        SidebarFilterPage.setPriceRangeFrom1Euro55ctTo3Euro55ct();

        actualResult = SidebarFilterPage.readFiltruojamaPagal();

        Assert.assertTrue(actualResult.contains(expectedResult),
        String.format("Actual result: %s; Expected result: %s", actualResult, expectedResult));
    }

    @Test
    public void testPriceFilter_1Euro55ctTo3Euro55ct_GivesOutCorrectItemsBOTZ() {

        Boolean expectedResult = true;

        SidebarFilterPage.chooseCategoryInSideBarBOTZ();
        SidebarFilterPage.scrollDownToSeePriceRangeSlider();
        SidebarFilterPage.setPriceRangeFrom1Euro55ctTo3Euro55ct();

        List<Double> pricesAfterFiltering = new ArrayList<>(SidebarFilterPage.getFilteredPrices());

        Boolean actualResult = SidebarFilterPage.areAllPricesInThePriceRangeChosen(pricesAfterFiltering);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
