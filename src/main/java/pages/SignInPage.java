package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    // Web Elements
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passTextField;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    private WebElement signInBtn;

    /**
     * Constructor
     *
     * @param driver
     */
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Sign in to the account
     *
     * @return
     */
    public MyAccountPage signIn() {
        // Enter email
        waitElementToBeClickable(emailTextField);
        emailTextField.sendKeys("gavuyabavu@digitalmail.info");
        // Enter password
        passTextField.sendKeys("12345");
        // Click on the sign in button
        signInBtn.click();
        return new MyAccountPage(getDriver());
    }

}
