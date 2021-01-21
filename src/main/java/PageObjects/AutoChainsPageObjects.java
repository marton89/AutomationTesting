package PageObjects;

import DriverConfiguration.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;
import static com.github.webdriverextensions.Bot.waitForPageToLoad;
import static org.openqa.selenium.support.PageFactory.initElements;

public class AutoChainsPageObjects extends DriverHelper {

    public AutoChainsPageObjects() {
        initElements(driver(), this);

    }

    @FindBy(how = How.LINK_TEXT, using = "Lanturi auto")
    private WebElement autoChains;

    @FindBy(how = How.ID, using = "2latime")
    private WebElement chainsWidth;

    @FindBy(how = How.ID, using = "2inaltime")
    private WebElement chainsHeight;

    @FindBy(how = How.ID, using = "2diametru")
    private WebElement chainsDiameter;

    @FindBy(how = How.ID, using = "2cauta-lanturi-auto")
    private WebElement chainsSearchButton;

    @FindBy(how = How.CSS, using = ".main-nav li a")
    private List<WebElement> menuItems;

    public void searchAutoChains() {
        waitForPageToLoad();
        clickElementAndWait(menuItems.get(1));

        clickElementAndWait(chainsWidth);
        Select selectTyresWidth = new Select(chainsWidth);
        selectTyresWidth.selectByValue("185");

        clickElementAndWait(chainsHeight);
        Select selectTyresHeight = new Select(chainsHeight);
        selectTyresHeight.selectByValue("45");

        clickElementAndWait(chainsDiameter);
        Select selectTyresDiameter = new Select(chainsDiameter);
        selectTyresDiameter.selectByValue("15");

        clickElementAndWait(chainsSearchButton);

    }

}
