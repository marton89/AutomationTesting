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

public class AutoEnvelopesPageObjects extends DriverHelper {

    public AutoEnvelopesPageObjects() {
        initElements(driver(), this);

    }

    @FindBy(how = How.LINK_TEXT, using = "Anvelope auto")
    private WebElement autoTyres;

    @FindBy(how = How.ID, using = "2latime")
    private WebElement tyresWidth;

    @FindBy(how = How.ID, using = "2inaltime")
    private WebElement tyresHeight;

    @FindBy(how = How.ID, using = "2diametru")
    private WebElement tyresDiameter;

    @FindBy(how = How.ID, using = "2cauta-anvelope-auto")
    private WebElement tyresSearchButton;

    @FindBy(how = How.CSS, using = ".main-nav li a")
    private List<WebElement> menuItems;

    public void searchAutoTyres() {
        waitForPageToLoad();
        clickElementAndWait(menuItems.get(1));

        clickElementAndWait(tyresWidth);
        Select selectTyresWidth = new Select(tyresWidth);
        selectTyresWidth.selectByValue("215");

        clickElementAndWait(tyresHeight);
        Select selectTyresHeight = new Select(tyresHeight);
        selectTyresHeight.selectByValue("55");

        clickElementAndWait(tyresDiameter);
        Select selectTyresDiameter = new Select(tyresDiameter);
        selectTyresDiameter.selectByValue("17");

        clickElementAndWait(tyresSearchButton);

    }

}
