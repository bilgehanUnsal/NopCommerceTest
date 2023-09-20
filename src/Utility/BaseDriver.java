package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    @BeforeClass
    public void baslangicIslemleri(){
        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        loginTesti();
    }

    public void loginTesti(){
        driver.get("https://demo.nopcommerce.com/");
        MyFunc.Bekle(2);
        js = (JavascriptExecutor) driver;

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        js.executeScript("arguments[0].click();", loginButton);

        WebElement inputMail = driver.findElement(By.id("Email"));
        wait.until(ExpectedConditions.elementToBeClickable(inputMail));
        inputMail.sendKeys("team14@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("Password"));
        wait.until(ExpectedConditions.elementToBeClickable(inputPassword));
        inputPassword.sendKeys("Team14.");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        js.executeScript("arguments[0].click();", loginBtn);

    }

    @AfterClass
    public void bitisIslemleri(){ // tearDown
        MyFunc.Bekle(5);
        driver.quit();
    }

}
