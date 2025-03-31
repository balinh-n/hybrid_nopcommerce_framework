package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.User.AddressPageObject;
import pageObjects.Nopcommerce.User.CustomerInfoPageObject;
import pageObjects.Nopcommerce.User.HomePageObject;
import pageObjects.Nopcommerce.User.LogInPageObject;
import pageObjects.Nopcommerce.User.MyaccountPageObject;
import pageObjects.Nopcommerce.User.OrdersPageObjects;
import pageObjects.Nopcommerce.User.PageGenerateManage;
import pageObjects.Nopcommerce.User.RewardsPointPageObject;

public class LV4_PageNavigation extends BaseTest {
    WebDriver driver;
    public HomePageObject homePage;
    public LogInPageObject loginPage;
    public MyaccountPageObject myAccountPage;
    public CustomerInfoPageObject customerInfoPage;
    public AddressPageObject addressPage;
    public RewardsPointPageObject rewardsPointPage;
    public OrdersPageObjects ordersPage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowserWithEnum(browser, GlobalConstants.USER_URL);
        homePage = PageGenerateManage.getHomePage(driver);
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
        myAccountPage = homePage.clickMyAccountLink();
        addressPage = myAccountPage.clickAddressPageLink();
        rewardsPointPage = myAccountPage.clickRewardsPointLink();
        ordersPage = myAccountPage.clickOrdersLink();
        customerInfoPage = myAccountPage.clickCustomerInfoLink();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
