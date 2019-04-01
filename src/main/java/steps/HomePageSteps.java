package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

    //Obligatory variable for serenity used for serialization
    private static final long serialVersionUID = -8318968866877510036L;

    /**
     * Constructor
     * @param pages
     */
    public HomePageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Method returns HomePage entity
     * @return HomePage entity
     */
    private HomePage onHomePage() {
        return pages().get(HomePage.class);
    }

    //Serenity steps
    @Step("User opens site and gets Home page")
    public void userOpensSiteAndGetsHomePage() {
        onHomePage().openSite();
    }
    @Step("User proceed to sign in page")
    public void userProceedToSignInPage() {
        onHomePage().signInClick();
    }
}
