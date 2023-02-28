package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.AddToCartPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setup() {
        AddToCartPage.open();
        AddToCartPage.acceptCookies();
    }

    @Test
    public void testAddToCartRaudonaRiebiMolioMase() {

        String quantity20Kg = "2";
        String quantity5Kg = "2";
        Integer totalItemsInBasket;
        totalItemsInBasket = Integer.parseInt(quantity5Kg) + Integer.parseInt(quantity20Kg);
        String expectedResult;
        expectedResult = totalItemsInBasket.toString();
        String actualResult;

        AddToCartPage.clickButtonAddToCart();
        AddToCartPage.selectTextGivenValueQuantity20Kg();
        AddToCartPage.typeNewValueQuantity20Kg(quantity20Kg);
        AddToCartPage.selectTextGivenValueQuantity5Kg();
        AddToCartPage.typeNewValueQuantity5Kg(quantity5Kg);
        AddToCartPage.clickButtonSubmitAddToCart();

        actualResult = AddToCartPage.readValueNumberOfItemsInBasket(expectedResult);

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected Result: %s, actual result: %s", expectedResult, actualResult));

    }

}
