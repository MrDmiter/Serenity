package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductPage;

public class ProductPageSteps extends ScenarioSteps {


    /**
     * Constructor
     * @param pages
     */
    public ProductPageSteps (Pages pages){
        super(pages);
    }

    /**
     * Method returns ProductPage entity
     * @return ProductPage entity
     */
    private ProductPage onProductPage(){
        return pages().get(ProductPage.class);
    }

    //Serenity step
    @Step("Add to cart and proceed to checkout")
    public void addToCartAndProceedToCheckout(){
        onProductPage().addToCartAndProceedToCheckout();
    }

}
