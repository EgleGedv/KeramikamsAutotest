package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.HomePage;
import lt.egle.keramikams.pom.pages.SideBarFilterPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideBarFilterTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        HomePage.open();
        HomePage.acceptCookies();
        HomePage.mouseHoverOnPrekiuKatalogas();
        HomePage.selectFromPrekiuKatalogas("Vokiška glazūra");
    }

    @Test
    public void testSideBarPriceFilterLabelAppearanceBOTZ() {

        String expectedResult = "1,55 € - 4,55 €";
        String actualResult;

        SideBarFilterPage.chooseCategoryInSideBarBOTZ();
        SideBarFilterPage.scrollDownToSeePriceRangeSlider();
        SideBarFilterPage.setPriceRangeFrom1Euro55ctTo4Euro55ct();

        actualResult = SideBarFilterPage.readCurrentFilteredValue();

        Assert.assertTrue(actualResult.contains(expectedResult),
        String.format("Actual result: %s; Expected result: %s", actualResult, expectedResult));
    }
}
