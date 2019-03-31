package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage extends PageObject {

    // Web Elements

    private WebDriverWait wait;
    @FindBy(
            xpath =
                    "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")
    private WebElement tShirts;

    /**
     * Constructor
     *
     * @param driver
     */
    public AbstractPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    /**
     * Open site
     *
     * @return
     */
    public void openSite() {
        getDriver().manage().window().maximize();
        getDriver().get("http://automationpractice.com/");
    }


    /**
     * Wait element to be clickable
     *
     * @param webElement
     */
    public void waitElementToBeClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /**
     * Wait element to be visible
     *
     * @param webElement
     */
    public void waitElementToBeVisible(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitTillTextToBePresentInElementValue(String locator, int expectedValue) {
        wait.until(ExpectedConditions.
                textToBePresentInElementValue(
                        By.xpath(locator), String.valueOf(expectedValue)));
    }

}
