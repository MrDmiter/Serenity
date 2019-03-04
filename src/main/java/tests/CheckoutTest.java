package tests;

import base.AbstractTest;
import org.junit.Test;
import pages.*;

public class CheckoutTest extends AbstractTest {

    @Test
    public void testCheckoutTest() {
        HomePage homePage = openSite();
        log("Opened Site");
        SignInPage signInPage = homePage.signInClick();
        log("Entered the signIn page");
        MyAccountPage myAccountPage = signInPage.signIn();
        log("Signed in into account");
        TShirtsPage tShirtsPage = myAccountPage.clickOnTShirts();
        log("Entered t-shirts category");
        ProductPage productPage = tShirtsPage.clickOnProduct();
        productPage.verifyBreadCrumbs();
        CheckoutPage checkoutPage= productPage.addToCartAndProceedToCheckout();
        checkoutPage.verifyTotalPriceDependingOnTheAmountOfProductInTheCart(1);
        checkoutPage.removeFromCart();
        checkoutPage.verifyCartIsEmpty();
        closeSite();

    }
}

