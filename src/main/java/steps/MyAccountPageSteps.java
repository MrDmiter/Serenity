package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MyAccountPage;

public class MyAccountPageSteps extends ScenarioSteps {

    public MyAccountPageSteps(Pages pages) {
        super(pages);
    }

    private MyAccountPage onMyAccountPage(){
        return pages().get(MyAccountPage.class);
    }

    @Step("User click on evening dresses link")
    public void userClickOnEveningDressesLink(){
        onMyAccountPage().focusOnElement();
        onMyAccountPage().clickOnEveningDresses();
    }
}
