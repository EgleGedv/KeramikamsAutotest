package lt.egle.keramikams.pom.tests;

import lt.egle.keramikams.pom.pages.ItemSearchPage;
import lt.egle.keramikams.pom.pages.LoginPage;
import lt.egle.keramikams.pom.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemSearchTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        ItemSearchPage.open();
    }


}
