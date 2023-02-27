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

        ItemSearchPage.sleep(5000);
        ItemSearchPage.acceptCookies();
        ItemSearchPage.typeItemToSearchFor(searchKeyword);
        ItemSearchPage.sleep(5000);
        ItemSearchPage.clickOnMagnifierToSearch();

        actualResult = ItemSearchPage.getNameFirstGivenItem();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }

    @Test
    public void testNegativeUsingSearchField() {

        String expectedResult = "prekių nebuvo rasta";
        String actualResult;
        String searchKeyword = "Rauuuu";

        ItemSearchPage.sleep(5000);
        ItemSearchPage.acceptCookies();
        ItemSearchPage.typeItemToSearchFor(searchKeyword);
        ItemSearchPage.sleep(5000);
        ItemSearchPage.clickOnMagnifierToSearch();

        actualResult = ItemSearchPage.readMessageNotice();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }
}
