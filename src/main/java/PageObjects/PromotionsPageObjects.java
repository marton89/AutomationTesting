package PageObjects;

import DriverConfiguration.DriverHelper;

import static com.github.webdriverextensions.Bot.driver;
import static org.openqa.selenium.support.PageFactory.initElements;

public class PromotionsPageObjects extends DriverHelper {
    public PromotionsPageObjects() {
        initElements(driver(), this);
    }
}
