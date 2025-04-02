package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;
import pageObjects.Nopcommerce.DynamicUser.DynamicRegisterPageObject;

public class LV14_ReportNG extends BaseTest {
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
    public void TC1_RegisterEmptyData() {
        log.info("Open Register Page");
        registerPage = homePage.clickRegisterLink();
        log.info("Click Register Button");
        registerPage.clickRegisterButton();
        log.info("Compare FirstName Error");
        verifyEquals("First name is required..", registerPage.getFirstNameError());
        log.info("Compare LastName Error");
        verifyEquals("Last name is required.", registerPage.getLastNameError());
        log.info("Compare Email Error");
        verifyEquals("Email is required...", registerPage.getEmailError());
        log.info("Compare Password Error");
        verifyEquals("Password is required.", registerPage.getPasswordError());
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
