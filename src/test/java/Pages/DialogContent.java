package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    public WebElement idBox;
    @FindBy(css = "[name='password']")
    public WebElement pass;
    @FindBy(css = "[type='submit']")
    public WebElement login;

    @FindBy(css = "[class='oxd-select-text-input']")
    public WebElement userRoleSelect;
    @FindBy(xpath = "//div[text()='ESS']")
    public WebElement ess;
    @FindBy(xpath = "//div[@role='listbox']/*")
    public List<WebElement> listbox;
    //div[@role='listbox']/*
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    public WebElement statusSelect;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    public WebElement addBtn;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    public WebElement employee;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    public WebElement userName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    public WebElement password1;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    public WebElement password2;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
    public WebElement eemployeName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/span")
    public WebElement Negatifverify;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "idBox":
                return idBox;
            case "addBtn":
                return addBtn;
            case "userName":
                return userName;
            case "password1":
                return password1;
            case "password2":
                return password2;
        }

        return null;
    }
}
