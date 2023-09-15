import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

    public Locators() { PageFactory.initElements(BaseDriver.driver, this); }

    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy(id = "Email")
    public WebElement inputMail;

    @FindBy(id = "Password")
    public WebElement inputPassword;

    @FindBy(className = "button-1 login-button")
    public WebElement loginBtn;
}
