import DriverConfiguration.DriverHelper;
import PageObjects.AutoEnvelopesPageObjects;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Chrome

public class AutoEnvelopesTest extends DriverHelper {
    private AutoEnvelopesPageObjects autoEnvelopesTest;

    public AutoEnvelopesTest() {
        autoEnvelopesTest = new AutoEnvelopesPageObjects();
    }

    @Before
    public void setupApplication() {
        setupApplication(this.applicationUnderTest);
    }

    @Test
    public void selectTyreValue() {
        autoEnvelopesTest.searchAutoTyres();
    }

    @After
    public void tearDown() {
         closeApplication();
    }

}


