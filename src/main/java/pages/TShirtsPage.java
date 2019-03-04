package pages;

import base.AbstractTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TShirtsPage extends AbstractPage {

    // Web element
    @FindBy(xpath = "//div[@class='button-container']/a/span[contains(text(),'More')]")
    private WebElement product;

    @FindBy(xpath = "//div[@class='product-container']")
    private WebElement productContainer;

    /**
     * Constructor
     *
     * @param testClass
     */
    public TShirtsPage(AbstractTest testClass) {
        super(testClass);
    }

    /** Hover over product to make needed buttons visible */
    public void hoverOverProduct() {
        Actions builder = new Actions(testClass.getDriver());
        builder.moveToElement(productContainer).build().perform();
    }

    /**
     * Open the product page
     *
     * @return ProductPage entity
     */
    public ProductPage clickOnProduct() {
        hoverOverProduct();
        testClass.waitElementToBeClickable(product);
        product.click();
        return new ProductPage(testClass);
    }
}
