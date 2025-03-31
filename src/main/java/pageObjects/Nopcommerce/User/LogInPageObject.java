package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.User.LogInPageUI;

public class LogInPageObject extends BasePage {
    WebDriver driver;

    public LogInPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmail(String valueText) {
        waitForElementVisible(driver, LogInPageUI.EMAIL_TXT);
        sendTextToElement(driver, LogInPageUI.EMAIL_TXT,valueText);
    }

    public void inputPassword(String valueText) {
        waitForElementVisible(driver, LogInPageUI.PASSWORD_TXT);
        sendTextToElement(driver, LogInPageUI.PASSWORD_TXT, valueText);
    }

    public HomePageObject clickLogInButton() {
        waitForElementClickable(driver, LogInPageUI.LOGIN_BUTTON);
        clickToElement(driver, LogInPageUI.LOGIN_BUTTON);
        return PageGenerateManage.getHomePage(driver);
    }

    public void getEmailError() {
        waitForElementVisible(driver, LogInPageUI.EMAIL_ERROR);
        getTextOfElement(driver, LogInPageUI.EMAIL_ERROR);
    }

    public void getInvalidCredential() {
        waitForElementVisible(driver, LogInPageUI.INVALIDCREDENTIAL_MESSAGE);
        getTextOfElement(driver, LogInPageUI.INVALIDCREDENTIAL_MESSAGE);
    }
}
