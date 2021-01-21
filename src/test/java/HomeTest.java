import DriverConfiguration.DriverHelper;
import PageObjects.HomePageObjects;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Chrome
public class HomeTest extends DriverHelper {
    private HomePageObjects homeTest;

    public HomeTest() {

        homeTest = new HomePageObjects();
    }

    @Before
    public void setUp() {
        setupApplication(this.applicationUnderTest);
    }

    @Test
    public void verifyMainMenuItems() {
        homeTest.clickMenuItems();
    }

    @Test
    public void verifySecondaryMenuItems() {
        homeTest.verifySecondaryNavigation();
    }

    @Test
    public void verifySearchMenu() {
        homeTest.searchBox();
    }

    @Test
    public void verifyInformationMenu() {
        homeTest.clickInformationTabs();
    }

    @Test
    public void verifyChatTab() {
        homeTest.clickChatTab();
    }

    @Test
    public void verifyBuyButtonTab() {
        homeTest.clickBuyButtonTab();
    }

    @Test
    public void verifyFacebookTab() {
        homeTest.clickFacebookTab();
    }

    @After//e.g.close browser
    public void tearDown() {
        closeApplication();
    }

    }
