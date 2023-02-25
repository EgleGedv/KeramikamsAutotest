package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.ItemSearchPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemSearchTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        ItemSearchPage.open();
    }

    @Test
    public void testPositiveUsingSearchField() {

        String expectedResult = "Raudona riebi molio masė";
        String actualResult;
        String searchKeyword = "Raudona riebi molio mase";

        ItemSearchPage.sleep();
        ItemSearchPage.acceptCookies();
        ItemSearchPage.typeItemToSearchFor(searchKeyword);
        ItemSearchPage.sleep();
        ItemSearchPage.clickOnMagnifierToSearch();

        actualResult = ItemSearchPage.getNameFirstGivenItem();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }
    
}
