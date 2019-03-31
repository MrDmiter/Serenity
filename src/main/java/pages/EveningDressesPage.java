package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class EveningDressesPage extends AbstractPage {

    private String PRODUCT_DETAILS_XPATH = "//h5[@itemprop='name']/a[contains(., '%s')]";


    //Constructor
    public EveningDressesPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Find product by the its name and click on it
     * @param nameOfProduct
     * @return entity of the product page
     */
    public ProductPage clickOnProduct(String nameOfProduct) {
        getDriver().findElement(By.xpath(String.format(PRODUCT_DETAILS_XPATH, nameOfProduct))).click();
        return new ProductPage(getDriver());
    }
}
