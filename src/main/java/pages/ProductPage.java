package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class ProductPage extends AbstractPage {

    // Web elements
    @FindBy(xpath = "//li/a[@name='Pink']")
    private WebElement pinkColor;

    @FindBy(xpath = "//span[contains(.,'Add to cart')]")
    private WebElement cart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement toCheckout;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement viewCart;

    @FindBy(xpath = "//div[@class='product-atributes']/a")
    private WebElement orderAtributes;

    @FindBy(xpath = "//span[@class='remove_link']")
    private WebElement removeProductFromCartbtn;

    @FindBy(xpath = "//span[@class='ajax_cart_no_product']")
    private WebElement cartIsEmpty;

    /**
     * Constructor
     *
     * @param driver
     */
    public ProductPage(WebDriver driver) {
        super(driver);
    }



    /**
     * Choose pink color
     */
    public void clickOnPinkColor(){
        pinkColor.click();
    }
    public void selectSizeInDropdown(String size){
        Select dropdown = new Select(getDriver().findElement(By.xpath("//select[@name='group_1']")));
        dropdown.selectByVisibleText(size);
    }
    public void addToCartAndProceedToCheckout(){
        cart.click();
        waitElementToBeVisible(toCheckout);
        toCheckout.click();
    }

    public void hoverOverShopCartAndVerifyColorAndSize(){
        Actions action = new Actions(getDriver());
        action.moveToElement(viewCart).build().perform();
        waitElementToBeVisible(orderAtributes);
        Assert.assertEquals("Pink, L",orderAtributes.getText());
    }

    public void removeProductFromCart(){
        waitElementToBeClickable(removeProductFromCartbtn);
        removeProductFromCartbtn.click();
    }

    public void verifyCartIsEmpty(){
        Assert.assertEquals("(empty)",cartIsEmpty.getText());
        String actualWindow = getDriver().getWindowHandle();
        Set<String> windowHandles = getDriver().getWindowHandles();
        String windowToSwitchTo = null;
        for (String windowHandle : windowHandles) {
            if(windowHandle!=actualWindow){
                windowToSwitchTo=windowHandle;
            }
        }
        getDriver().switchTo().window(windowToSwitchTo);
        getDriver().close();
    }


}
