import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Bilgehan extends BaseDriver {

    @Test(groups = {"UserRegistiration" , "Smoke"})
    public void Register(){
        Locators lc = new Locators();

        myClick(lc.register);
        myClick(lc.genderRadio);
        mySendKeys(lc.firstNameInput, "Team14");
        mySendKeys(lc.lastNameInput, "TechnoStudy");
        mySelectClass(lc.birthDay, "17");
        mySelectClass(lc.birthMonth, "August");
        mySelectClass(lc.birthYear, "1994");
        mySendKeys(lc.emailInput, "bigteam14@gmail.com");
        mySendKeys(lc.passwordInput, "BigTeam14.");
        mySendKeys(lc.conPassInput, "BigTeam14.");
        myClick(lc.registerButton);
        verifyContainsText(lc.registerApplied, "Your registration completed");
    }

    @Test (groups = {"LoginTest", "Smoke"})
    public void Login(){
        Locators lc = new Locators();

        myClick(lc.loginButton);
        mySendKeys(lc.logInMail, "bigteam14@gmail.com");
        mySendKeys(lc.logInPassword, "BigTeam14.");
        myClick(lc.getLogIn);

        verifyContainsText(lc.myAccount, "my account");
    }

    @Test(groups = {"UI Testing", "TAB Menu", "Sipariş Testleri"})
    public void GiftTest(){
        Locators lc = new Locators();

        myClick(lc.gift);
        myClick(lc.card);
        mySendKeys(lc.reName, "Aysel");
        mySendKeys(lc.name, "Tamella");
        mySendKeys(lc.message, "Dogum gunun kutlu olsun");
        myClick(lc.giftAdd);

        verifyContainsText(lc.giftVerify, "shopping cart");
    }

    @Test(groups = {"UI Testing", "TAB Menu", "Sipariş Testleri"})
    public void BuyingComputer(){
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

    @Test(groups = {"UI Testing", "TAB Menu"})
    public void TabMenu(){
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

    public class _US_07_Search01_Main extends BaseDriver {

        @Test
        @Parameters("searchText")
        public void ParametersSearch(String arananKelime){
            Locators lc = new Locators();

            mySendKeys(lc.searchStore, arananKelime);
            myClick(lc.searchButton);

            verifyContainsText(lc.adobeVerify, "Adobe Photoshop CS4");
        }
    }
}
