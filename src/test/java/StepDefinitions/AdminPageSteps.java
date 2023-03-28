package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class AdminPageSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Navigate to Admin Page and Click add Button")
    public void navigateToAdminPageAndClickAddButton() {
        ln.clickFunction(ln.admin);
        dc.clickFunction(dc.addBtn);

    }
}
