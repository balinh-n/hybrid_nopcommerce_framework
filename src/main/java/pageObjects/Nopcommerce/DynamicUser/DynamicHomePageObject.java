package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.Nopcommerce.DynamicUser.DynamicHomePageUI;

public class DynamicHomePageObject extends BasePage {
    WebDriver driver;

    public DynamicHomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open the register page")
    public DynamicRegisterPageObject clickRegisterLink() {
        waitForDynamicElementClickable(driver, DynamicHomePageUI.DYNAMIC_REGISTER_LINK);
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
