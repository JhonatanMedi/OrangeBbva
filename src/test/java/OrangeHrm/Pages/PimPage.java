package OrangeHrm.Pages;

import OrangeHrm.DateBase.InsertDataBase;
import OrangeHrm.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private InsertDataBase insertDataBase;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement txtLastName;


    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);

    }

    public void llegarAddEmployee() {
        buttonPages.btnPim();
        buttonPages.btnAddEmployee();
    }

    public void fillOutAddEmployee(String firstName, String middleName, String lastName) {
        txtFirstName.sendKeys(firstName);
        txtMiddleName.sendKeys(middleName);
        txtLastName.sendKeys(lastName);
        insertDataBase.insertEmployee(firstName,middleName,lastName);
        buttonPages.btnSave();
    }
}
