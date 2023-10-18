package OrangeHrm.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[text()='PIM']")
    private WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
    private WebElement btnAddEmployee;

    @FindBy(how = How.XPATH, using = "//button[text()=' Save ']")
    private WebElement btnSave;
    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnLogin(){
        btnLogin.isDisplayed();
        btnLogin.click();
    }

    public void btnPim(){
        btnPim.isEnabled();
        btnPim.click();
    }

    public void btnAddEmployee(){
        btnAddEmployee.isDisplayed();
        btnAddEmployee.click();
    }

    public void btnSave(){
        btnSave.isEnabled();
        btnSave.click();
    }
}
