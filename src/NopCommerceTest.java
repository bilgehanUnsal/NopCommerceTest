import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class NopCommerceTest extends BaseDriver {

    @Test(groups = {"UserRegistiration", "Smoke"}, priority = 1)
    public void Register() {
        Locators lc = new Locators();

        myClick(lc.register);
        myClick(lc.genderRadio);
        mySendKeys(lc.firstNameInput, "Team14");
        mySendKeys(lc.lastNameInput, "TechnoStudy");
        mySelectClass(lc.birthDay, "17");
        mySelectClass(lc.birthMonth, "August");
        mySelectClass(lc.birthYear, "1994");
        mySendKeys(lc.emailInput, "teteam14@gmail.com");
        mySendKeys(lc.passwordInput, "BigTeam14.");
        mySendKeys(lc.conPassInput, "BigTeam14.");
        myClick(lc.registerButton);
        verifyContainsText(lc.registerApplied, "Your registration completed");
    }

    @Test(groups = {"LoginTest", "Smoke"}, priority = 2)
    public void Login() {
        Locators lc = new Locators();

        myClick(lc.loginButton);
        mySendKeys(lc.logInMail, "teteam14@gmail.com");
        mySendKeys(lc.logInPassword, "BigTeam14.");
        myClick(lc.getLogIn);

        verifyContainsText(lc.myAccount, "my account");
    }

    @Test(groups = {"UI Testing", "TAB Menu", "Sipariş Testleri"}, priority = 3)
    public void GiftTest() {
        Locators lc = new Locators();

        myClick(lc.gift);
        myClick(lc.card);
        mySendKeys(lc.reName, "Aysel");
        mySendKeys(lc.name, "Tamella");
        mySendKeys(lc.message, "Dogum gunun kutlu olsun");
        myClick(lc.giftAdd);

        verifyContainsText(lc.giftVerify, "shopping cart");
    }

    @Test(groups = {"UI Testing", "TAB Menu", "Sipariş Testleri"}, priority = 4)
    public void BuyingComputer() {
        Locators lc = new Locators();

        aksiyonlar.moveToElement(lc.computers).build().perform();
        myClick(lc.desktops);
        myClick(lc.build);
        mySelectClass(lc.ram, "8GB [+$60.00]");
        myClick(lc.hDD);
        myClick(lc.radioOS);
        myClick(lc.software1);
        myClick(lc.software2);
        myClick(lc.computerAdd);

        verifyContainsText(lc.verifyComputer, "shopping cart");
    }

    @Test(groups = {"UI Testing", "TAB Menu"}, priority = 5)
    public void TabMenu() {
        Locators lc = new Locators();

        aksiyonlar.moveToElement(lc.Computer).build().perform();
        myClick(lc.Desk);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.Computer).build().perform();
        myClick(lc.NoteBook);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.Computer).build().perform();
        myClick(lc.Soft);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.Electronics).build().perform();
        myClick(lc.Camera);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.Electronics).build().perform();
        myClick(lc.phone);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.Electronics).build().perform();
        myClick(lc.others);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.App).build().perform();
        myClick(lc.Shoes);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.App).build().perform();
        myClick(lc.Clot);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        aksiyonlar.moveToElement(lc.App).build().perform();
        myClick(lc.Acces);
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        lc.Digital.click();
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        lc.book.click();
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        lc.jewe.click();
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));

        lc.giftcard.click();
        wait.until(ExpectedConditions.visibilityOf(lc.dogrulama));
    }
    @Test (groups = {"UI Testing", "Search", "Smoke Test", "Regression"}, priority = 6)
    @Parameters("searchText")
    public void ParametersSearch(String arananKelime) {
        Locators lc = new Locators();

        mySendKeys(lc.searchStore, arananKelime);
        myClick(lc.searchButton);

        scrollToElement(lc.adobeVerify);
        verifyContainsText(lc.adobeVerify, "Adobe Photoshop CS4");
    }
    @Test(groups = {"Smoke Test", "LoginTest"}, dataProvider = "UserData")
    public void hataliGirisTest(String mail, String password) {

        Locators lc = new Locators();

        myClick(lc.loginButton);
        mySendKeys(lc.logInMail, mail);
        mySendKeys(lc.logInPassword, password);
        myClick(lc.getLogIn);

        List<WebElement> logIn = driver.findElements(By.cssSelector("[class='message-error validation-summary-errors'] ul li"));
        if (logIn.size()>0){
            verifyContainsText(lc.unSucLogIn, "No customer account found");
        } else {
            verifyContainsText(lc.myAccount, "my account");
        }
    }

    @DataProvider
    public Object[][] UserData() {
        Object[][] data = {
                {"bushra@gmail.com", "11111"},
                {"tamella@gmail.com", "11111"},
                {"bilgehan@gmail.com", "11111"},
                {"deniz@gmail.com", "11111"},
                {"bilal@gmail.com", "11111"},
                {"hakan@gmail.com", "11111"},
                {"teteam14@gmail.com", "BigTeam14."}
        };
        return data;

    }
}
