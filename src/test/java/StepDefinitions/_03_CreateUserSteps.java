package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;

public class _03_CreateUserSteps {
    Robot robot=new Robot();
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    public _03_CreateUserSteps() throws AWTException {
    }

    @And("fill up the form by entering the required info to the all input boxes I click on Save button")
    public void fillUpTheFormByEnteringTheRequiredInfoToTheAllInputBoxesIClickOnSaveButton() {
        dc.clickFunction(dc.userRoleSelect);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']/*"),2));
        dc.clickFunction(dc.listbox.get(2));
        dc.clickFunction(dc.statusSelect);
        dc.clickFunction(dc.listbox.get(1));
        String admin=dc.eemployeName.getText();
        String bosluk= String.valueOf(admin.indexOf(" "));
        String soyad=admin.substring(Integer.parseInt(bosluk));
        dc.sendKeysFunction(dc.employee,admin);
        wait.until(ExpectedConditions.stalenessOf(dc.listbox.get(0)));
        wait.until(ExpectedConditions.textToBePresentInElement(dc.listbox.get(0), soyad));
        dc.clickFunction(dc.listbox.get(0));
        dc.clickFunction(dc.saveButton);

    }

    @And("Send to user name five  characters")
    public void sendToUserNameFiveCharacters() { dc.clickFunction(dc.userRoleSelect);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']/*"),2));
        dc.clickFunction(dc.listbox.get(2));
        dc.clickFunction(dc.statusSelect);
        dc.clickFunction(dc.listbox.get(1));
        String admin=dc.eemployeName.getText();
        String bosluk= String.valueOf(admin.indexOf(" "));
        String soyad=admin.substring(Integer.parseInt(bosluk));
        dc.sendKeysFunction(dc.employee,admin);
        wait.until(ExpectedConditions.stalenessOf(dc.listbox.get(0)));
        wait.until(ExpectedConditions.textToBePresentInElement(dc.listbox.get(0), soyad));
        dc.clickFunction(dc.listbox.get(0));
        dc.sendKeysFunction(dc.userName,"hulk");



    }
}
