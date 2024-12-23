package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.nopcommerce.PageGenerateManager;
import pageObjects.nopcommerce.users.HomePageObject;
import pageObjects.nopcommerce.users.RegisterPageObject;

public class LV9_DynamicLocator extends BaseTest{
    WebDriver driver;
    private HomePageObject getHomePage;
    private RegisterPageObject getRegisterPage;
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://localhost:5001/");
        getHomePage = PageGenerateManager.getHomePage(driver);
    }

    @Test
    public void TC01_Register_EmptyData() {
        getRegisterPage = getHomePage.clickRegisterLink();
        getRegisterPage.clickRegisterButton();
        Assert.assertEquals(getRegisterPage.getFirstNameError(), "First name is required.");
        Assert.assertEquals(getRegisterPage.getLastNameError(), "Last name is required.");
        Assert.assertEquals(getRegisterPage.getEmailError(), "Email is required.");
        Assert.assertEquals(getRegisterPage.getPasswordError(), "Password is required.");
    }

    @Test
    public void TC02_Register_WrongEmailFormat() {
        getHomePage = getRegisterPage.clickImageLink();
        getRegisterPage = getHomePage.clickRegisterLink();
        getRegisterPage.sendTextToFirstName("Jack");
        getRegisterPage.sendTextToLastName("Sparrow");
        getRegisterPage.sendTextToEmail("abcd@gmail");
        getRegisterPage.sendTextToPassword("abcd1234@");
        getRegisterPage.sendTextToCfmPassword("abcd1234@");
        getRegisterPage.clickRegisterButton();
        Assert.assertEquals(getRegisterPage.getEmailError(), "Wrong email");
    }

    @Test
    public void TC03_Register_ExistEmail() {
        getHomePage = getRegisterPage.clickImageLink();
        getRegisterPage = getHomePage.clickRegisterLink();
        getRegisterPage.sendTextToFirstName("Jack");
        getRegisterPage.sendTextToLastName("Sparrow");
        getRegisterPage.sendTextToEmail(GlobalConstants.USEREMAIL);
        getRegisterPage.sendTextToPassword("abcd1234@");
        getRegisterPage.sendTextToCfmPassword("abcd1234@");
        getRegisterPage.clickRegisterButton();
        Assert.assertEquals(getRegisterPage.getEmailValidation(), "The specified email already exists");
    }

    @Test
    public void TC04_Register_PasswordLessThan6Character() {
        getHomePage = getRegisterPage.clickImageLink();
        getRegisterPage = getHomePage.clickRegisterLink();
        getRegisterPage.sendTextToFirstName("Jack");
        getRegisterPage.sendTextToLastName("Sparrow");
        getRegisterPage.sendTextToEmail("gmail1@gmail.com");
        getRegisterPage.sendTextToPassword("abc");
        getRegisterPage.sendTextToCfmPassword("abc");
        getRegisterPage.clickRegisterButton();
        Assert.assertEquals(getRegisterPage.getPasswordValidation(),
                "<p>must meet the following rules: </p><ul><li>must have at least 6 characters and not greater than 64 characters</li></ul>");
    }

    @Test
    public void TC05_Register_PasswordNotMatch() {
        getHomePage = getRegisterPage.clickImageLink();
        getRegisterPage = getHomePage.clickRegisterLink();
        getRegisterPage.sendTextToFirstName("Jack");
        getRegisterPage.sendTextToLastName("Sparrow");
        getRegisterPage.sendTextToEmail("gmail1@gmail.com");
        getRegisterPage.sendTextToPassword("abcd1234@");
        getRegisterPage.sendTextToCfmPassword("abcd123@");
        getRegisterPage.clickRegisterButton();
        Assert.assertEquals(getRegisterPage.getPasswordError(),
                "The password and confirmation password do not match.");
    }

    @Test
    public void TC06_Register_Successfully() {
        getHomePage = getRegisterPage.clickImageLink();
        getRegisterPage = getHomePage.clickRegisterLink();
        getRegisterPage.sendTextToFirstName("Jack");
        getRegisterPage.sendTextToLastName("Sparrow");
        getRegisterPage.sendTextToEmail(getRandomEmail(6));
        getRegisterPage.sendTextToPassword("abcd1234@");
        getRegisterPage.sendTextToCfmPassword("abcd1234@");
        getRegisterPage.clickRegisterButton();
        Assert.assertEquals(getRegisterPage.getSuccessMessage(),
                "Your registration completed");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
