package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.HomePage;
import lt.egle.keramikams.pom.pages.Locator;
import lt.egle.keramikams.pom.pages.SideBarFilterPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
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
    public void testSideBarFilterBotzWhite9876(){

        SideBarFilterPage.chooseCategoryInSideBarBOTZ();
        SideBarFilterPage.scrollDownToSeePriceRangeSlider();
        SideBarFilterPage.setPriceRange();


    }
}
