package PageObjects;

import DriverConfiguration.DriverHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Arrays;
import java.util.List;

import static com.github.webdriverextensions.Bot.*;
import static com.github.webdriverextensions.Bot.waitFor;
import static org.openqa.selenium.support.How.CLASS_NAME;
import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePageObjects extends DriverHelper {

    public HomePageObjects() {
        initElements(driver(), this);
    }

    @FindBy(how = How.CSS, using = ".main-nav li a")
    private List<WebElement> menuItems;

    @FindBy(how = How.ID, using = "tab_auto")
    private WebElement autoTab;

    @FindBy(how = How.ID, using = "tab_camioane")
    private WebElement truckTab;

    @FindBy(how = How.ID, using = "tab_moto")
    private WebElement motoTab;

    @FindBy(how = How.ID, using = "tab_accesorii")
    private WebElement accessoriesTab;

    @FindBy(how = How.CSS, using = ".tabs_view")
    private List<WebElement> tabInView;

    @FindBy(name = "q")
    private WebElement queryInput;
    @FindBy(how = How.CSS, using = ".button")
    WebElement searchButton;
    @FindBy(how = CLASS_NAME, using = "mb-category-products")
    private WebElement searchResult;


    @FindBy(how = How.CSS, using = ".block-content")
    private List<WebElement> bottomPageContent;

    @FindBy(how = How.CSS, using = ".col-sm-6 li a")
    private List<WebElement> informationTabs;

    //
    @FindBy(how = How.CSS, using = "short-message")
    private List<WebElement> chatTab;

    @FindBy(how = How.CSS, using = "cart-info")
    private List<WebElement> buyButtonTab;

    @FindBy(how = How.CSS, using = "https://www.facebook.com/e.pneu.ro/")
    private List<WebElement> facebookTab;

    /**
     * method used to click and open the tabs of the main Menu
     */
    //verificam dand click pagina cu pagina si verificam daca schimband pagina se modifica url; i repr nr pagina la care sunt
    public void clickMenuItems() {
        waitForPageToLoad();
        for (int i = 0; i < menuItems.size(); i++) {
            String urlToVerify = menuItems.get(i).getAttribute("href");
            clickElementAndWait(menuItems.get(i));
            if (i == 7) {
                waitFor(3);
                assertAttributeContains("target", "_blank", menuItems.get(i));
                verifyNewTab(urlToVerify);
            } else {
                verifyPageUrl(urlToVerify);
            }
        }
    }

    /**
     * method used to click and open the tabs of the secondary Menu
     */
    public void verifySecondaryNavigation() {
        waitForPageToLoad();
        List<WebElement> secondaryMenuItems = Arrays.asList(autoTab, truckTab, motoTab, accessoriesTab);
        for (int i = 0; i < secondaryMenuItems.size(); i++) {
            clickElementAndWait(secondaryMenuItems.get(i));
            waitFor(5);
            assertAttributeContains("style", "display: block;", tabInView.get(i));

        }
    }

    /**
     * method used to search for envelopes in the search box, using specific dimensions
     */
    public void searchBox(){

        type("2055515", queryInput);
        waitFor(3);
        clickElementAndWait(searchButton);
        /*queryInput.sendKeys(Keys.ENTER);*/
        assertTextContains("205", searchResult);
    }

    /**
     * method used to click and open the INFORMATION tabs
     */
    public void clickInformationTabs() {
        waitForPageToLoad();
        /*for (int j = 0; j < bottomPageContent.size(); j++) {
            hoverOver(bottomPageContent.get(j));
            if (j == 5) {
                */
        for (int i = 0; i < informationTabs.size(); i++) {
            clickElementAndWait(informationTabs.get(i));
           String urlToVerify = informationTabs.get(i).getAttribute("href");
            if (i == 4) {
                waitFor(3);
                assertAttributeContains("target", "_blank", informationTabs.get(i));
                verifyNewTab(urlToVerify);
            } else if (i == 11) {
                waitFor(3);
                assertAttributeContains("target", "_blank", informationTabs.get(i));
                verifyNewTab(urlToVerify);
            } else {
                verifyPageUrl(urlToVerify);
            }


        }
    }


    /**
     * method used to click and open the tabs of the main Menu
     */

    public void clickSocialMenuItems() {
        waitForPageToLoad();
        for (int i = 0; i < menuItems.size(); i++) {
            String urlToVerify = menuItems.get(i).getAttribute("href");
            clickElementAndWait(menuItems.get(i));
            if (i == 7) {
                waitFor(3);
                assertAttributeContains("target", "_blank", menuItems.get(i));
                verifyNewTab(urlToVerify);
            } else {
                verifyPageUrl(urlToVerify);
            }
        }
    }
//
    /**
     * method used to click and open the Chat Tab
     */
    public void clickChatTab() {
        waitForPageToLoad();
        for (int i = 0; i < chatTab.size(); i++) {
            String urlToVerify = chatTab.get(i).getAttribute("href");
            clickElementAndWait(chatTab.get(i));
            if (i == 7) {
                waitFor(3);
                assertAttributeContains("target", "_blank", chatTab.get(i));
                verifyNewTab(urlToVerify);
            } else {
                verifyPageUrl(urlToVerify);
            }
        }
    }


    public void clickBuyButtonTab() {
        waitForPageToLoad();
        for (int i = 0; i < buyButtonTab.size(); i++) {
            String urlToVerify = buyButtonTab.get(i).getAttribute("href");
            clickElementAndWait(buyButtonTab.get(i));
            if (i == 7) {
                waitFor(3);
                assertAttributeContains("target", "_blank", buyButtonTab.get(i));
                verifyNewTab(urlToVerify);
            } else {
                verifyPageUrl(urlToVerify);
            }
        }
    }


    public void clickFacebookTab() {
        waitForPageToLoad();
        for (int i = 0; i < facebookTab.size(); i++) {
            String urlToVerify = facebookTab.get(i).getAttribute("href");
            clickElementAndWait(facebookTab.get(i));
            if (i == 7) {
                waitFor(3);
                assertAttributeContains("target", "_blank", facebookTab.get(i));
                verifyNewTab(urlToVerify);
            } else {
                verifyPageUrl(urlToVerify);
            }
        }
    }

}

