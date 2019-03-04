package pages;

import base.AbstractTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TShirtsPage extends AbstractPage {
    //Web element
//    @FindBy(xpath = "//div/a[@title='Faded Short Sleeve T-shirts']")
//    private WebElement product;
    @FindBy(xpath = "//div[@class='button-container']/a/span[contains(text(),'More')]")
    private WebElement product;

    @FindBy(xpath = "//div[@class='product-container']")
    private WebElement productContainer;


    public TShirtsPage(AbstractTest testClass) {
        super(testClass);
    }

    /**
     * Hover over product
     */
    public void hoverOverProduct() {
        Actions builder = new Actions(testClass.getDriver());
        builder.moveToElement(productContainer).build().perform();
    }

    public ProductPage clickOnProduct() {
        hoverOverProduct();
        testClass.waitElementToBeClickable(product);
        product.click();
        return new ProductPage(testClass);
    }

}
