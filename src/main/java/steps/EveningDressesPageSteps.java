package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.EveningDressesPage;

public class EveningDressesPageSteps extends ScenarioSteps {

    /**
     * Constructor
     * @param pages
     */
    public EveningDressesPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Method returns EveningDressesPage entity
     * @return EveningDressesPage entity
     */
    private EveningDressesPage onEveningDressesPage(){
        return pages().get(EveningDressesPage.class);
    }

    /**
     * Serenity step
     */
    @Step("Click on product")
    public void clickOnProduct(){
        onEveningDressesPage().clickOnProduct("Printed Dress");
    }
}
