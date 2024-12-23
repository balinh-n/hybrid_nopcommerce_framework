package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import pageObjects.nopcommerce.admin.AdminDashboardPageObject;
import pageObjects.nopcommerce.admin.AdminLoginPageObject;
import pageObjects.nopcommerce.users.AddressPageObject;
import pageObjects.nopcommerce.users.CustomerInfoPageObject;
import pageObjects.nopcommerce.users.HomePageObject;
import pageObjects.nopcommerce.users.LoginPageObject;
import pageObjects.nopcommerce.users.MyAccountSideBarPageObject;
import pageObjects.nopcommerce.users.RegisterPageObject;

public class PageGenerateManager {

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static MyAccountSideBarPageObject getMyaccountSideBar(WebDriver driver) {
        return new MyAccountSideBarPageObject(driver);
    }

    public static AddressPageObject getAddressPage(WebDriver driver) {
        return new AddressPageObject(driver);
    }

    public static CustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
        return new CustomerInfoPageObject(driver);
    }

    public static AdminLoginPageObject getAdminLoginPage(WebDriver driver) {
        return new AdminLoginPageObject(driver);
    }

    public static AdminDashboardPageObject getAdminDashBoardPage(WebDriver driver) {
        return new AdminDashboardPageObject(driver);
    }
}
