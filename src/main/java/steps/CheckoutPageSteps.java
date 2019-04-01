package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CheckoutPage;

public class CheckoutPageSteps extends ScenarioSteps {


    /**
     * Constructor
     * @param pages
     */
    public CheckoutPageSteps (Pages pages){
        super(pages);
    }

    /**
     * Method returns CheckoutPage entity
     * @return CheckoutPage entity
     */
    private CheckoutPage onCheckoutPage(){
        return pages().get(CheckoutPage.class);
    }

    /**
     * Serenity step
     */
    @Step("User verify price removes product from cart and verifies that cart is empty")
    public void userVerifyPriceRemovesProductFromCartAndVerifiesThatCartIsEmpty(){
        onCheckoutPage().verifyTotalPriceDependingOnTheAmountOfProductInTheCart(2);
        onCheckoutPage().removeFromCart();
        onCheckoutPage().verifyCartIsEmpty();
    }
}
