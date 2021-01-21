package PageObjects;

import DriverConfiguration.DriverHelper;
import PageObjects.AutoChainsPageObjects;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Chrome

public class AutoChainsTest extends DriverHelper {

    public AutoChainsPageObjects autoChainsTest;

    public AutoChainsTest() {
        autoChainsTest = new AutoChainsPageObjects();
    }

    @Before
    public void setupApplication() {
        setupApplication(this.applicationUnderTest);
    }

    @Test
    public void selectChainValue() {
        autoChainsTest.searchAutoChains();
    }

    @After
    public void tearDown() {
        closeApplication();
    }

}