package pageObjects.nopcommerce.users;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObjects.nopcommerce.PageGenerateManager;
import pageUIs.users.HomePageUI;

public class HomePageObject extends BasePage {

    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPageObject clickRegisterLink() {
        waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
        clickToElement(driver, HomePageUI.REGISTER_LINK);
        return PageGenerateManager.getRegisterPage(driver);
    }

    public LoginPageObject clickLogInLink() {
        waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
        clickToElement(driver, HomePageUI.LOGIN_LINK);
        return PageGenerateManager.getLoginPage(driver);
    }

    public void clickLogOutLink() {
        waitForElementClickable(driver, HomePageUI.LOGOUT_LINK);
        clickToElement(driver, HomePageUI.LOGOUT_LINK);
    }

    public CustomerInfoPageObject clickMyaccountLink() {
        waitForElementVisible(driver, HomePageUI.MYACCOUNT_LINK);
        clickToElement(driver, HomePageUI.MYACCOUNT_LINK);
        return PageGenerateManager.getCustomerInfoPage(driver);
    }

    // Dynamic Locator
    public void clickDynamicRegisterLink() {
        waitForDynamicElementClickable(driver, HomePageUI.DYNAMIC_REGISTER_LINK);
        clickToDynamicElement(driver, HomePageUI.DYNAMIC_REGISTER_LINK);
    }

    public LoginPageObject clickDynamicLoginLink() {
        waitForDynamicElementClickable(driver, HomePageUI.DYNAMIC_LOGIN_LINK);
        clickToDynamicElement(driver, HomePageUI.DYNAMIC_LOGIN_LINK);
        return PageGenerateManager.getLoginPage(driver);
    }

    public CustomerInfoPageObject clickDynamicMyAccountLink() {
        waitForDynamicElementClickable(driver, HomePageUI.DYNAMIC_MYACCOUNT_LINK);
        clickToDynamicElement(driver, HomePageUI.DYNAMIC_MYACCOUNT_LINK);
        return PageGenerateManager.getCustomerInfoPage(driver);
    }
}
