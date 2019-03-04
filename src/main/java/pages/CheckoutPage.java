package pages;

import base.AbstractTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends AbstractPage {
    private WebDriverWait wait;
    @FindBy(xpath = "//i[@class='icon-plus']")
    private WebElement increaseNumberOfProducts;
    @FindBy(xpath = "//td[@class='cart_total']/span[@class='price']")
    private WebElement totalPriceForOneItem;
    @FindBy(xpath = "//tr[@class='cart_total_price']/td[@id='total_product']")
    private WebElement totalPriceForAllProducts;
    @FindBy(xpath = "//i[@class='icon-trash']")
    private WebElement trashIcon;
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement cartIsEmptyMessage;


    public CheckoutPage(AbstractTest testClass) {
        super(testClass);

    }

    int amountOfProducts=0;
    public void verifyTotalPriceDependingOnTheAmountOfProductInTheCart(int amountOfProducts) {
        double priceForOneProduct = Double.parseDouble(totalPriceForOneItem.getText().replaceAll("\\$",""));
        System.out.println(priceForOneProduct);
        for (int i = 0; i < amountOfProducts; i++) {
            increaseNumberOfProducts.click();

        }
        //Нет других идей, кнопка добавления количества товаров слишком быстро срабатывает, поэтому Thread.sleep
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(Double.parseDouble(totalPriceForAllProducts.getText().replaceAll("\\$","")),priceForOneProduct*(amountOfProducts+1), 0.0);

    }
    public void removeFromCart(){
        trashIcon.click();
    }
    public void verifyCartIsEmpty(){
        testClass.waitElementToBeVisible(cartIsEmptyMessage);
    Assert.assertEquals("Your shopping cart is empty.", cartIsEmptyMessage.getText());
    }

}
