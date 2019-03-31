package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductPage;

public class ProductPageSteps extends ScenarioSteps {

    public ProductPageSteps (Pages pages){
        super(pages);
    }

    private ProductPage onProductPage(){
        return pages().get(ProductPage.class);
    }

    @Step("Add to cart and proceed to checkout")
    public void addToCartAndProceedToCheckout(){
        onProductPage().addToCartAndProceedToCheckout();
    }

}
