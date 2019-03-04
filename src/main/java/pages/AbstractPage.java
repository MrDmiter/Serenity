package pages;

import base.AbstractTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected AbstractTest baseTest;

    //Web Elements

    @FindBy(xpath = "//div/a[@class='login']")
    private WebElement stickySignInBtn;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a[@title='Dresses']")
    private WebElement dressesTab;

    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Summer Dresses'][contains(text(),'Summer Dresses')]")
    private WebElement summerDressesSubTab;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tShirts;

    //Instance of BaseTest
    protected AbstractTest testClass;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractPage(AbstractTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this);
    }

    /**
     * Click on the sign in button on the home page
     *
     * @return
     */
    public SignInPage signInClick() {
        stickySignInBtn.click();
        return new SignInPage(testClass);
    }



    public TShirtsPage clickOnTShirts(){
        tShirts.click();
        return new TShirtsPage(testClass);
    }

    public void verifyBreadCrumbs(){

    }
}
