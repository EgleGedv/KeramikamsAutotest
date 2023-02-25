package lt.egle.keramikams.pom.tests.common;

import lt.egle.keramikams.pom.pages.Common;
import lt.egle.keramikams.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setup();

//    @AfterMethod
//    public void teardown() {
//        Common.closeDriver();
//    }
}
