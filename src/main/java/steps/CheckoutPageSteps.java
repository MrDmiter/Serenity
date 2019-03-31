package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CheckoutPage;

public class CheckoutPageSteps extends ScenarioSteps {
    public CheckoutPageSteps (Pages pages){
        super(pages);
    }

    private CheckoutPage onCheckoutPage(){
        return pages().get(CheckoutPage.class);
    }

    @Step("User verify price removes product from cart and verifies that cart is empty")
    public void userVerifyPriceRemovesProductFromCartAndVerifiesThatCartIsEmpty(){
        onCheckoutPage().verifyTotalPriceDependingOnTheAmountOfProductInTheCart(2);
        onCheckoutPage().removeFromCart();
        onCheckoutPage().verifyCartIsEmpty();
    }
}
