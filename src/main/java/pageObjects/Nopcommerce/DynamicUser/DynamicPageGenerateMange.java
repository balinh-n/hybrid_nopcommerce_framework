package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

public class DynamicPageGenerateMange {
    public static DynamicHomePageObject getHomePage(WebDriver driver) {
        return new DynamicHomePageObject(driver);
    }

    public static DynamicRegisterPageObject getRegisterPage(WebDriver driver) {
        return new DynamicRegisterPageObject(driver);
    }

    public static DynamicLogInPageObject getLoginPage(WebDriver driver) {
        return new DynamicLogInPageObject(driver);
    }

    public static DynamicMyaccountPageObject getMyaccountPage(WebDriver driver) {
        return new DynamicMyaccountPageObject(driver);
    }
    public static DynamicAddressPageObject getAddressPage(WebDriver driver) {
        return new DynamicAddressPageObject(driver);
    }

    public static DynamicCustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
        return new DynamicCustomerInfoPageObject(driver);
    }
}
