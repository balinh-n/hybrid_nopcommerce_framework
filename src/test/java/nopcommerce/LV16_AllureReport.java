package nopcommerce;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import io.qameta.allure.Feature;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicLogInPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;
import pageObjects.Nopcommerce.DynamicUser.DynamicRegisterPageObject;

@Feature("AllureReport")
public class LV16_AllureReport extends BaseTest {
    WebDriver driver;
    public DynamicHomePageObject homePage;
    public DynamicRegisterPageObject registerPage;
    public DynamicLogInPageObject loginPage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowserWithEnum(browser, GlobalConstants.USER_URL);
        homePage = DynamicPageGenerateMange.getHomePage(driver);
    }

    @Test
    public void TC1_RegisterEmptyData() {
        registerPage = homePage.clickRegisterLink();
        registerPage.clickRegisterButton();
        verifyEquals("First name is required..", registerPage.getFirstNameError());
        verifyEquals("Last name is required.", registerPage.getLastNameError());
        verifyEquals("Email is required.", registerPage.getEmailError());
        verifyEquals("Password is required.", registerPage.getPasswordError());
    }

    @Test
    public void TC2_RegisterWrongEmail() {
        homePage = registerPage.clickNopcomerceImage();
        registerPage = homePage.clickRegisterLink();
        registerPage.inputFirstName("Black");
        registerPage.inputLastName("Pearl");
        registerPage.inputEmail("abcd" + new Random().nextInt(999) + "@gmail");
        registerPage.inputPassword("abcd1234@");
        registerPage.inputConfirmPassword("abcd1234@");
        registerPage.clickRegisterButton();
        verifyEquals("Wrong email.", registerPage.getEmailError());
    }

    @Test
    public void TC3_PasswordDoNotMatch() {
        homePage = registerPage.clickNopcomerceImage();
        registerPage = homePage.clickRegisterLink();
        registerPage.inputFirstName("Black");
        registerPage.inputLastName("Pearl");
        registerPage.inputEmail("abcd" + new Random().nextInt(999) + "@gmail.com");
        registerPage.inputPassword("abcd1234@");
        registerPage.inputConfirmPassword("abcd1234");
        registerPage.clickRegisterButton();
        verifyEquals("The password and confirmation password do not match.", registerPage.getPasswordError());
    }

    @Test
    public void TC4_PasswordLessThan6Character() {
        homePage = registerPage.clickNopcomerceImage();
        registerPage = homePage.clickRegisterLink();
        registerPage.inputFirstName("Black");
        registerPage.inputLastName("Pearl");
        registerPage.inputEmail("abcd" + new Random().nextInt(999) + "@gmail.com");
        registerPage.inputPassword("abc");
        registerPage.inputConfirmPassword("abc");
        registerPage.clickRegisterButton();
        verifyEquals(
                "Password must meet the following rules: must have at least 6 characters and not greater than 64 characters",
                registerPage.getPasswordValidation());
    }

    @Test
    public void TC5_RegisterEmailExist() {
        homePage = registerPage.clickNopcomerceImage();
        registerPage = homePage.clickRegisterLink();
        registerPage.inputFirstName("Black");
        registerPage.inputLastName("Pearl");
        registerPage.inputEmail("admin@mystore.com");
        registerPage.inputPassword("abcd1234@");
        registerPage.inputConfirmPassword("abcd1234@");
        registerPage.clickRegisterButton();
        verifyEquals("The specified email already exists.", registerPage.getEmailValidation());
    }

    @Test
    public void TC6_RegisterSuccressfully() {
        homePage = registerPage.clickNopcomerceImage();
        registerPage = homePage.clickRegisterLink();
        registerPage.inputFirstName("Black");
        registerPage.inputLastName("Pearl");
        registerPage.inputEmail("abcd" + new Random().nextInt(999) + "@gmail.com");
        registerPage.inputPassword("abcd1234@");
        registerPage.inputConfirmPassword("abcd1234@");
        registerPage.clickRegisterButton();
        verifyEquals("Your registration completed.", registerPage.getRegisterMessage().trim());
        registerPage.clickContinueButton();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}