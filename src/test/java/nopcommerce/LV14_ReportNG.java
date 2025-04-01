package nopcommerce;

import commons.BaseTest;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Nopcommerce.DynamicUser.*;

public class LV14_ReportNG extends BaseTest {
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
        log.info("LogIn Step 1: Open Login Page");
        loginPage = homePage.clickLogInLink();

        log.info("LogIn Step 2: Input Email");
        loginPage.inputEmail("admin@mystore.com");

        log.info("LogIn Step 3: Input Passowrd");
        loginPage.inputPassword("abcd1234");

        log.info("LogIn Step 2: Click Login Button");
        homePage = loginPage.clickLogInButton();
    }

    @Test
    public void TC2_SwitchPage() {
        log.info("Switch Page Step 1: Open Myaccount Page");
        getMyaccountPage = homePage.clickMyaccountLink();

        log.info("Switch Page Step 1: Open Address Page");
        getAddressPage = (DynamicAddressPageObject) getMyaccountPage.clickDynamicTab("Addresses");

        log.info("Switch Page Step 1: Open CustomerInfo Page");
        getCustomerInfoPage = (DynamicCustomerInfoPageObject) getAddressPage.clickDynamicTab("Customer info");

    }
}
