package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage {

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement dresses;
    @FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']/li/ul/li/a[@title='Evening Dresses']")
    private WebElement eveningDresses;

    /**
     * Constructor
     *
     * @param driver
     */
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Hover over Women tab
     */
    public void focusOnElement(){
        Actions builder = new Actions(getDriver());
        builder.moveToElement(dresses).build().perform();
        waitElementToBeVisible(eveningDresses);
    }

    /**
     * Click on the evening dresses
     */
    public EveningDressesPage clickOnEveningDresses(){
        eveningDresses.click();
        return new EveningDressesPage(getDriver());
    }
}
