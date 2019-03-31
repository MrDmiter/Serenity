package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

    private static final long serialVersionUID = -8318968866877510036L;

    public HomePageSteps(Pages pages) {
        super(pages);
    }

    private HomePage onHomePage() {
        return pages().get(HomePage.class);
    }

    @Step("User opens site and gets Home page")
    public void userOpensSiteAndGetsHomePage() {
        onHomePage().openSite();
    }
    @Step("User proceed to sign in page")
    public void userProceedToSignInPage() {
        onHomePage().signInClick();
    }
}
