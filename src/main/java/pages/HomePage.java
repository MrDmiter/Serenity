package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


    //Web elements
    @FindBy(xpath = "//div/a[@class='login']")
    private WebElement stickySignInBtn;
    /**
     * Constructor
     *
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Click on the sign in button on the home page
     *
     * @return
     */
    public SignInPage signInClick() {
        waitElementToBeClickable(stickySignInBtn);
        stickySignInBtn.click();
        return new SignInPage(getDriver()) ;
    }



}
