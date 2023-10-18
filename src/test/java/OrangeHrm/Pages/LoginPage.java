package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    private ButtonPages buttonPages;
    private Questions questions;

    //idenficador de elementos
    @FindBy(how = How.NAME, using = "username")
    //varaible del elemeto
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;

    //esto es un constructor
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    //esto es un metodo
    public void fillOutLogin(String userName, String password) {
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
        this.buttonPages.btnLogin();
        this.questions.timeSeconds(2);
        this.questions.screenShot();
    }
}
