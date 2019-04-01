package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SignInPage;

public class SignInPageSteps extends ScenarioSteps {

    /**
     * Constructor
     * @param pages
     */
    public SignInPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Method returns SignInPage entity
     * @return SignInPage entity
     */
    private SignInPage onSignInPage() {
        return pages().get(SignInPage.class);
    }

    //Serenity step
    @Step("User proceed to the My Account page")
    public void userProceedToTheMyAccountPage(){
        onSignInPage().signIn();
    }
}



