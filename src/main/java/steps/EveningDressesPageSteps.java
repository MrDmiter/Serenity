package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.EveningDressesPage;

public class EveningDressesPageSteps extends ScenarioSteps {

    public EveningDressesPageSteps(Pages pages) {
        super(pages);
    }

    private EveningDressesPage onEveningDressesPage(){
        return pages().get(EveningDressesPage.class);
    }

    @Step("Click on product")
    public void clickOnProduct(){
        onEveningDressesPage().clickOnProduct("Printed Dress");
    }
}
