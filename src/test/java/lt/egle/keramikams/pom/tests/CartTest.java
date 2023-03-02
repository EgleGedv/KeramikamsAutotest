package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.CartPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        CartPage.open();
        CartPage.acceptCookies();
    }

    @Test
    public void testAddToCartRaudonaRiebiMolioMase20kg_2and5kg_2() {

        String quantity20Kg = "2";
        String quantity5Kg = "2";
        Integer totalItemsInBasket;
        totalItemsInBasket = Integer.parseInt(quantity5Kg) + Integer.parseInt(quantity20Kg);
        String expectedResult;
        expectedResult = totalItemsInBasket.toString();
        String actualResult;

        CartPage.clickButtonAddToCart();
        CartPage.selectTextGivenValueQuantity20Kg();
        CartPage.typeNewValueQuantity20Kg(quantity20Kg);
        CartPage.selectTextGivenValueQuantity5Kg();
        CartPage.typeNewValueQuantity5Kg(quantity5Kg);
        CartPage.clickButtonSubmitAddToCart();

        actualResult = CartPage.readValueNumberOfItemsInBasket(expectedResult);

        Assert.assertTrue(actualResult.contains(expectedResult),
                String.format("Expected Result: %s, actual result: %s", expectedResult, actualResult));
    }

}
