package Deniz;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _01_Deniz extends BaseDriver {

    @Test(groups = {"UI Testing" , "TAB Menu"})
    public void us04(){
        Elements el = new Elements();

        Actions aksiyonlar=new Actions(driver);
        aksiyonlar.moveToElement(el.Computer).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.Desk));
        el.Desk.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.Computer).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.NoteBook));
        el.NoteBook.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.Computer).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.Soft));
        el.Soft.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.Electronics).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.Camera));
        el.Camera.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.Electronics).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.phone));
        el.phone.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.Electronics).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.others));
        el.others.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.App).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.Shoes));
        el.Shoes.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.App).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.Clot));
        el.Clot.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        aksiyonlar.moveToElement(el.App).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(el.Acces));
        el.Acces.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));

        el.Digital.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));
        el.book.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));
        el.jewe.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));
        el.giftcard.click();
        wait.until(ExpectedConditions.visibilityOf(el.dogrulama));










    }


}
