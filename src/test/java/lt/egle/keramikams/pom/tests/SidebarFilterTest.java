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

        String expectedResult = "4,59 € - 12,59 €";
        String actualResult;

        SidebarFilterPage.chooseCategoryInSideBarBOTZ();
        SidebarFilterPage.scrollDownToSeePriceRangeSlider();
        SidebarFilterPage.setPriceRangeToMax3Euro55ct();

        actualResult = SidebarFilterPage.readFiltruojamaPagal();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual result: %s; Expected result: %s", actualResult, expectedResult));
    }

    @Test
    public void testPriceFilter_1Euro55ctTo3Euro55ct_GivesOutCorrectItemsBOTZ() {

        Boolean expectedResult = true;

        SidebarFilterPage.chooseCategoryInSideBarBOTZ();
        SidebarFilterPage.scrollDownToSeePriceRangeSlider();
        SidebarFilterPage.setPriceRangeToMax3Euro55ct();

        List<Double> pricesAfterFilteringMax3_55 = new ArrayList<>(SidebarFilterPage.getFilteredPricesMax3_55());

        Boolean actualResult = SidebarFilterPage.areAllPricesInThePriceRange1_55to3_55Euro(pricesAfterFilteringMax3_55);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPriceFilter_1Euro55ctTo4Euro55ct_GivesOutInCorrectItemsBOTZ() {

        Boolean expectedResult = false;

        SidebarFilterPage.chooseCategoryInSideBarBOTZ();
        SidebarFilterPage.scrollDownToSeePriceRangeSlider();
        SidebarFilterPage.setPriceRangeToMax4Euro55ct();

        List<Double> pricesAfterFilteringMax4_55 = new ArrayList<>(SidebarFilterPage.getFilteredPricesMax4_55());

        Boolean actualResult = SidebarFilterPage.areAllPricesInThePriceRange1_55to4_55Euro(pricesAfterFilteringMax4_55);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSideBarFilterBotzWhite9876() {

        String expectedResult = "BOTZ 9876 Balta glazūra";
        String actualResult;

        SidebarFilterPage.chooseCategoryInSideBarBOTZ();
        SidebarFilterPage.scrollDownToSeePriceRangeSlider();
        SidebarFilterPage.setPriceRangeToMax4Euro55ct();

        SidebarFilterPage.clickOnDengiamumas();
        SidebarFilterPage.selectDengianti();

        SidebarFilterPage.clickOnBlizgesioLygis();
        SidebarFilterPage.selectBlizgus();

        SidebarFilterPage.clickOnGlazurosSavybes();
        SidebarFilterPage.selectRekomenduojamaIndams();

        SidebarFilterPage.selectColour("Balta");

        actualResult = SidebarFilterPage.readNameFirstItem();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Actual result: %s; Expected result: %s", actualResult, expectedResult));
    }
}
