package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopcommerce.PageGenerateManager;
import pageObjects.nopcommerce.users.HomePageObject;
import pageObjects.nopcommerce.users.RegisterPageObject;

public class LV4_MultiBrowser extends BaseTest{
    WebDriver driver;
    private HomePageObject getHomePage;
    private RegisterPageObject getRegisterPage;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName,"https://localhost:5001/");
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

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
