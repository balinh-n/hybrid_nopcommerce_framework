package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.nopcommerce.PageGenerateManager;
import pageObjects.nopcommerce.admin.AdminDashboardPageObject;
import pageObjects.nopcommerce.admin.AdminLoginPageObject;
import pageObjects.nopcommerce.users.HomePageObject;
import pageObjects.nopcommerce.users.LoginPageObject;

public class LV8_SwitchUser extends BaseTest{
    WebDriver driver;
    private String userUrl;
    private String adminUrl;
    private HomePageObject userHomePage;
    private LoginPageObject userLogInPage;
    private AdminLoginPageObject adminLogInPage;
    private AdminDashboardPageObject adminDashboardPage;

    @Parameters({"browser", "userUrl", "adminUrl"})
    @BeforeClass
    public void beforeClass(String browserName, String userUrl, String adminUrl) {
        this.adminUrl = adminUrl;
        this.userUrl = userUrl;
        driver = getBrowserDriver(browserName, this.userUrl);
        userHomePage = PageGenerateManager.getHomePage(driver);
    }

    @Test
    public void TC1_UserLogin() throws InterruptedException {
        userLogInPage = userHomePage.clickLogInLink();
        userLogInPage.sendTextToEmail(GlobalConstants.USEREMAIL);
        userLogInPage.sendTextToPassword(GlobalConstants.USERPASSWORD);
        userHomePage = userLogInPage.clickLoginButton();
        userHomePage.openUrl(driver, adminUrl);
        adminLogInPage = PageGenerateManager.getAdminLoginPage(driver);
        adminLogInPage.sendTextToEmail(GlobalConstants.ADMINEMAIL);
        adminLogInPage.sendTextToPassword(GlobalConstants.ADMINPASSWORD);
        adminDashboardPage = adminLogInPage.clickLoginButton();
        adminDashboardPage.openUrl(driver, userUrl);
    }

    @Test
    public void TC2_SwitchToAdmin() {
        userHomePage.openUrl(driver, adminUrl);
        adminLogInPage = PageGenerateManager.getAdminLoginPage(driver);
        adminLogInPage.sendTextToEmail(GlobalConstants.ADMINEMAIL);
        adminLogInPage.sendTextToPassword(GlobalConstants.ADMINPASSWORD);
        adminDashboardPage = adminLogInPage.clickLoginButton();
    }

    @Test
    public void TC3_SwitchToUser() {
        adminDashboardPage.openUrl(driver, userUrl);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
