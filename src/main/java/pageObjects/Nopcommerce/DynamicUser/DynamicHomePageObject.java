package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.DynamicUser.DynamicHomePageUI;

public class DynamicHomePageObject extends BasePage {
    WebDriver driver;

    public DynamicHomePageObject(WebDriver driver) {
            this.driver = driver;
    }
    public DynamicRegisterPageObject clickRegisterLink() {
        waitForElementClickable(driver, DynamicHomePageUI.DYNAMIC_REGISTER_LINK);
        clickToDynamicElement(driver, DynamicHomePageUI.DYNAMIC_REGISTER_LINK);
        return DynamicPageGenerateMange.getRegisterPage(driver);
    }

    public DynamicLogInPageObject clickLogInLink() {
        waitForDynamicElementClickable(driver, DynamicHomePageUI.DYNAMIC_LOGIN_LINK);
        clickToDynamicElement(driver, DynamicHomePageUI.DYNAMIC_LOGIN_LINK);
        return DynamicPageGenerateMange.getLoginPage(driver);
    }

    public void clickLogOutLink() {
        waitForDynamicElementClickable(driver, DynamicHomePageUI.DYNAMIC_LOGOUT_LINK);
        clickToDynamicElement(driver, DynamicHomePageUI.DYNAMIC_LOGOUT_LINK);
    }

    public DynamicMyaccountPageObject clickMyaccountLink() {
        waitForDynamicElementClickable(driver, DynamicHomePageUI.DYNAMIC_MYACCOUNT_LINK);
        clickToDynamicElement(driver, DynamicHomePageUI.DYNAMIC_MYACCOUNT_LINK);
        return DynamicPageGenerateMange.getMyaccountPage(driver);
    }

}
