package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.HomePage;
import lt.egle.keramikams.pom.pages.ItemSearchPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemSearchTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        HomePage.open();
        HomePage.acceptCookies();
    }

    @Test
    public void testPositiveUsingSearchField() {

        String expectedResult = "ARGILA";
        String searchKeyword = "raudona";
        String category = "Molio masės";
        String actualResult;

        HomePage.typeItemToSearchFor(searchKeyword);
        HomePage.selectCategoryFromListVisosKategorijos(category);
        HomePage.clickOnMagnifierToSearch();

        actualResult = ItemSearchPage.getNameFirstGivenItem();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }

    @Test
    public void testNegativeUsingSearchField() {

        String expectedResult = "prekių nebuvo rasta";
        String searchKeyword = "Rauuuu";
        String category = "Molio masės";
        String actualResult;

        HomePage.typeItemToSearchFor(searchKeyword);
        HomePage.selectCategoryFromListVisosKategorijos(category);
        HomePage.clickOnMagnifierToSearch();

        actualResult = ItemSearchPage.readMessageNotice();

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected result: %s, Actual result: %s", expectedResult, actualResult));
    }
}
