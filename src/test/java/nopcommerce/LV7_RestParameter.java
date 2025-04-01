package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.DynamicUser.DynamicAddressPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicCustomerInfoPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicLogInPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicMyaccountPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;

public class LV7_RestParameter extends BaseTest {
    WebDriver driver;
    public DynamicHomePageObject homePage;
    public DynamicLogInPageObject loginPage;
    public DynamicMyaccountPageObject getMyaccountPage;
    public DynamicAddressPageObject getAddressPage;
    public DynamicCustomerInfoPageObject getCustomerInfoPage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowser(browser, GlobalConstants.USER_URL);
        homePage = DynamicPageGenerateMange.getHomePage(driver);
    }

    @Test
    public void TC1_LogInWithValidAccount() {
        loginPage = homePage.clickLogInLink();
        loginPage.inputEmail("admin@mystore.com");
        loginPage.inputPassword("abcd1234");
        homePage = loginPage.clickLogInButton();
    }

    @Test
    public void TC2_SwitchPage() {
        getMyaccountPage = homePage.clickMyaccountLink();
        getAddressPage = (DynamicAddressPageObject) getMyaccountPage.clickDynamicTab("Addresses");
        getCustomerInfoPage = (DynamicCustomerInfoPageObject) getAddressPage.clickDynamicTab("Customer info");
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
}
