package Deniz;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);}

    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > a")
    public WebElement Computer;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(1) > a")
    public WebElement Desk;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(2) > a")
    public WebElement NoteBook;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(3) > a")
    public WebElement Soft;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > a")
    public WebElement Electronics;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(1) > a")
    public WebElement Camera;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(2) > a")
    public WebElement phone;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(3) > a")
    public WebElement others;

    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > a")
    public WebElement App;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(1) > a")
    public WebElement Shoes;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(2) > a")
    public WebElement Clot;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(3) > ul > li:nth-child(3) > a")
    public WebElement Acces;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(4) > a")
    public WebElement Digital;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(5) > a")
    public  WebElement book;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(6) > a")
    public WebElement jewe;
    @FindBy(css = "ul.top-menu.notmobile > li:nth-child(7) > a")
    public WebElement giftcard;

    @FindBy(css = "div > div.page-title > h1")
    public WebElement dogrulama;

}
