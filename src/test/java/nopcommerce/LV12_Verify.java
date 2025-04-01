package nopcommerce;

import commons.BaseTest;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;
import pageObjects.Nopcommerce.DynamicUser.DynamicRegisterPageObject;

public class LV12_Verify extends BaseTest {
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
        registerPage = homePage.clickRegisterLink();
        registerPage.clickRegisterButton();
        verifyEquals("First name is required..", registerPage.getFirstNameError());
        verifyEquals("Last name is required.", registerPage.getLastNameError());
        verifyEquals("Email is required...", registerPage.getEmailError());
        verifyEquals("Password is required.", registerPage.getPasswordError());
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
