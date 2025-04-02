package nopcommerce;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;
import pageObjects.Nopcommerce.DynamicUser.DynamicRegisterPageObject;
import reportConfigs.ExtentManager;

public class LV15_ExtentReport extends BaseTest {
    WebDriver driver;
    public DynamicHomePageObject homePage;
    public DynamicRegisterPageObject registerPage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowserWithEnum(browser, GlobalConstants.USER_URL);
        homePage = DynamicPageGenerateMange.getHomePage(driver);
    }

    @Test
    public void TC1_RegisterEmptyData(Method method) {
        ExtentManager.startTest(method.getName(),"TC1_Register");
        ExtentManager.getTest().log(Status.INFO,"TC1_Register-Step 1: Open Register Page");
        registerPage = homePage.clickRegisterLink();
        ExtentManager.getTest().log(Status.INFO,"TC1_Register-Step 2: Click Register Button");
        registerPage.clickRegisterButton();
        ExtentManager.getTest().log(Status.INFO,"TC1_Register-Step 3: Compare First Name Error");
        Assert.assertEquals("First name is required..", registerPage.getFirstNameError());
        ExtentManager.getTest().log(Status.INFO,"TC1_Register-Step 4: Compare Last Name Error");
        Assert.assertEquals("Last name is required.", registerPage.getLastNameError());
        ExtentManager.getTest().log(Status.INFO,"TC1_Register-Step 5: Compare Email Error");
        Assert.assertEquals("Email is required...", registerPage.getEmailError());
        ExtentManager.getTest().log(Status.INFO,"TC1_Register-Step 5: Compare Password Error");
        Assert.assertEquals("Password is required.", registerPage.getPasswordError());
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
