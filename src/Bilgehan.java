import Utility.BaseDriver;
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
}
