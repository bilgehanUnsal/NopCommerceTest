
import Utility.BaseDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

    public Locators() {PageFactory.initElements(BaseDriver.driver, this);}

    @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement register;

    @FindBy(xpath = "//span[@class='male']/input")
    public WebElement genderRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    public WebElement birthDay;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    public WebElement birthMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    public WebElement birthYear;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    public WebElement conPassInput;

    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    public WebElement registerApplied;

    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy(id = "Email")
    public WebElement logInMail;

    @FindBy(id = "Password")
    public WebElement logInPassword;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement getLogIn;

    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement myAccount;

    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement gift;

    @FindBy(xpath = "//a[@href='/50-physical-gift-card']")
    public WebElement card;

    @FindBy(id = "giftcard_44_RecipientName")
    public WebElement reName;

    @FindBy(id = "giftcard_44_SenderName")
    public WebElement name;

    @FindBy(xpath = "//textarea[@id='giftcard_44_Message']")
    public WebElement message;

    @FindBy(id = "add-to-cart-button-44")
    public WebElement giftAdd;

    @FindBy(xpath = "//p[@class='content']/a")
    public WebElement giftVerify;

    @FindBy(xpath = "//a[@href='/computers']")
    public WebElement computers;

    @FindBy(xpath = "//a[@href='/desktops']")
    public WebElement desktops;

    @FindBy(xpath = "//h2[@class='product-title']/a[text()='Build your own computer']")
    public WebElement build;

    @FindBy(id = "product_attribute_2")
    public WebElement ram;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    public WebElement hDD;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    public WebElement radioOS;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    public WebElement software1;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    public WebElement software2;

    @FindBy(css = "[id='add-to-cart-button-1']")
    public WebElement computerAdd;

    @FindBy(xpath = "//p[@class='content']/a")
    public WebElement verifyComputer;

}
