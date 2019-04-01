package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MyAccountPage;

public class MyAccountPageSteps extends ScenarioSteps {

    /**
     * Constructor
     * @param pages
     */
    public MyAccountPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Method returns MyAccountPage entity
     * @return MyAccountPage entity
     */
    private MyAccountPage onMyAccountPage(){
        return pages().get(MyAccountPage.class);
    }

    //Serenity step
    @Step("User click on evening dresses link")
    public void userClickOnEveningDressesLink(){
        onMyAccountPage().focusOnElement();
        onMyAccountPage().clickOnEveningDresses();
    }
}
