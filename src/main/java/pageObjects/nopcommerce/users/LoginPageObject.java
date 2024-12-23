package pageObjects.nopcommerce.users;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObjects.nopcommerce.PageGenerateManager;
import pageUIs.users.LoginPageUI;

public class LoginPageObject extends BasePage {

    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void sendTextToEmail(String valueText) {
        sendTextToElement(driver, LoginPageUI.EMAIL_TXT, valueText);
    }

    public void sendTextToPassword(String valueText) {
        sendTextToElement(driver, LoginPageUI.PASSWORD_TXT, valueText);
    }

    public HomePageObject clickLoginButton() {
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return PageGenerateManager.getHomePage(driver);
    }

    public HomePageObject clickNopImage() {
        clickToElement(driver, LoginPageUI.IMG_LINK);
        return PageGenerateManager.getHomePage(driver);
    }

    public String getEmailErrorMessage() {
        return getTextOfElement(driver, LoginPageUI.EMAIL_ERROR);
    }

    public String getMessageForEmailNotRegister() {
        return getTextOfElement(driver, LoginPageUI.INVALIDCREDENTIAL_MESSAGE);
    }

    // Dynamic Locator
    public void sendTextToDynamicEmail(String valueText) {
        waitForDynamicElementVisible(driver, LoginPageUI.DYNAMIC_EMAIL_TXT);
        sendTextToDynamicElement(driver, LoginPageUI.DYNAMIC_EMAIL_TXT, valueText);
    }

    public void sendTextToDynamicPass(String valueText) {
        waitForDynamicElementVisible(driver, LoginPageUI.DYNAMIC_PASSWORD_TXT);
        sendTextToDynamicElement(driver, LoginPageUI.DYNAMIC_PASSWORD_TXT, valueText);
    }

    public HomePageObject clickDynamicLogInButton() {
        waitForDynamicElementClickable(driver, LoginPageUI.DYNAMIC_LOGIN_BUTTON);
        clickToDynamicElement(driver, LoginPageUI.DYNAMIC_LOGIN_BUTTON);
        return PageGenerateManager.getHomePage(driver);
    }
}
