package serenity.tests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.*;

// Serenity runner
@RunWith(SerenityRunner.class)
public class SerenityCheckoutTest {

    @Managed
    WebDriver driver;

    // Also you can use pages
    @ManagedPages
    Pages pages;

    // Steps also available
    @Steps
    HomePageSteps homePageSteps;

    // Steps also available
    @Steps
    SignInPageSteps signInPageSteps;

    // Steps also available
    @Steps
    MyAccountPageSteps myAccountPageSteps;

    // Steps also available
    @Steps
    ProductPageSteps productPageSteps;

    // Steps also available
    @Steps
    EveningDressesPageSteps eveningDressesPageSteps;

    // Steps also available
    @Steps
    CheckoutPageSteps checkoutPageSteps;


    /**
     * Open site, add product to the cart, increase amount of the products in the cart, check price and empty cart
     */
    @Test
    public void testSerenityCheckoutTest() {
        homePageSteps.userOpensSiteAndGetsHomePage();
        homePageSteps.userProceedToSignInPage();
        signInPageSteps.userProceedToTheMyAccountPage();
        myAccountPageSteps.userClickOnEveningDressesLink();
        eveningDressesPageSteps.clickOnProduct();
        productPageSteps.addToCartAndProceedToCheckout();
        checkoutPageSteps.userVerifyPriceRemovesProductFromCartAndVerifiesThatCartIsEmpty();
    }
}
