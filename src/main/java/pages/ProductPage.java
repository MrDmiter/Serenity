package pages;

import base.AbstractTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {
    //Web element
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement breadCrumbs;

    @FindBy(xpath = "//button[@name='Submit']")
    private WebElement addToCart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckout;

    public ProductPage(AbstractTest testClass) {
        super(testClass);
    }

    public void verifyBreadCrumbs() {
        String[] droppedBreadCrumbs = breadCrumbs.getText().split(">");
        Assert.assertEquals("Faded Short Sleeve T-shirts", droppedBreadCrumbs[droppedBreadCrumbs.length - 1]);
    }
    public CheckoutPage addToCartAndProceedToCheckout(){
        addToCart.click();
        testClass.waitElementToBeClickable(proceedToCheckout);
        proceedToCheckout.click();
        return new CheckoutPage(testClass);
    }


}
