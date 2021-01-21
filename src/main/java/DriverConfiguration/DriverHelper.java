package DriverConfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.github.webdriverextensions.Bot.*;
import static com.github.webdriverextensions.internal.BotUtils.assertEndsWith;

public class DriverHelper {
    public String applicationUnderTest = "https://www.e-pneu.ro/";

    /**
     * helper method used to open application under test
     *
     * @param webApp -will open application under test
     */
    public void setupApplication(String webApp) {
        driver().get(webApp);
        driver().manage().window().maximize();
    }

    /**
     * helper method used to close application under test
     */
    public void closeApplication() {
        driver().quit();
    }

    /** helper method used to click on specific element
     * @param element
     */
    public void clickElementAndWait(WebElement element) {
        click(element);
        waitFor(2);
    }

    public void verifyPageUrl(String url) {

        assertCurrentUrlContains(url);
    }
/*
    /** helper method used to move the mouse over content block to inspect elements
     * @param block - used to hover over a specific content block

    public void hoverOver(WebElement block){
        Actions actions = new Actions(driver());
        WebElement block = driver().findElement(By.xpath();
        actions.moveToElement(block).perform();
    }*/
    public void verifyNewTab(String url) {
        waitForPageToLoad();
        String currentWindow = driver().getWindowHandle();//current windows
        String newWindow = driver().getWindowHandles().stream()//add tags to the tab list
                .filter(w -> !w.equals(currentWindow))
                .findFirst()
                .orElse(null);
        WebDriver newTab= driver().switchTo().window(newWindow);
        assertCurrentUrlContains(url);
        newTab.close();
        driver().switchTo().window(currentWindow);
    }
}
