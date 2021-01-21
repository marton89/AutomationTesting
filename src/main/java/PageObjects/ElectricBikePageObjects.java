package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.github.webdriverextensions.Bot.driver;
import static com.github.webdriverextensions.Bot.waitForPageToLoad;
import static org.openqa.selenium.support.PageFactory.initElements;

public class ElectricBikePageObjects {
    public ElectricBikePageObjects() {
        initElements(driver(), this);

    }

    @FindBy(how = How.LINK_TEXT, using = "Electric Bike")
    private WebElement electricBikes;

    @FindBy(how = How.ID, using = "")
    private WebElement highestPrice;

    @FindBy(how = How.ID, using = "")
    private WebElement lowestPrice;

    @FindBy(how = How.ID, using = "")
    private WebElement modelBikes;

    @FindBy(how = How.ID, using = "")
    private WebElement consumptionBikes;

    @FindBy(how = How.ID, using = "")
    private WebElement topSpeed;

    @FindBy (how = How.CSS, using = ".sort-by select")
    private List<WebElement> selectSortingOrder;

}


