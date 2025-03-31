package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

public class PageGenerateManage {

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static LogInPageObject getLoginPage(WebDriver driver) {
        return new LogInPageObject(driver);
    }

    public static MyaccountPageObject getMyaccountPage(WebDriver driver) {
        return new MyaccountPageObject(driver);
    }

    public static AddressPageObject getAddressPage(WebDriver driver) {
        return new AddressPageObject(driver);
    }

    public static CustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
        return new CustomerInfoPageObject(driver);
    }

    public static OrdersPageObjects getOrdersPage(WebDriver driver) {
        return new OrdersPageObjects(driver);
    }

    public static RewardsPointPageObject getRewardsPointPage(WebDriver driver) {
        return new RewardsPointPageObject(driver);
    }

}
