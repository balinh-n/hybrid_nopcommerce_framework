package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.DynamicUser.DynamicLogInPageUI;
import testData.JsonReader;

public class DynamicLogInPageObject extends BasePage {
    WebDriver driver;

    public DynamicLogInPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmail(String valueText) {
        waitForDynamicElementVisible(driver, DynamicLogInPageUI.DYNAMIC_EMAIL_TXT);
        sendTextToDynamicElement(driver, DynamicLogInPageUI.DYNAMIC_EMAIL_TXT, valueText);
    }

    public void inputPassword(String valueText) {
        waitForDynamicElementVisible(driver, DynamicLogInPageUI.DYNAMIC_PASSWORD_TXT);
        sendTextToDynamicElement(driver, DynamicLogInPageUI.DYNAMIC_PASSWORD_TXT, valueText);
    }

    public DynamicHomePageObject clickLogInButton() {
        waitForDynamicElementClickable(driver, DynamicLogInPageUI.DYNAMIC_LOGIN_BUTTON);
        clickToDynamicElement(driver, DynamicLogInPageUI.DYNAMIC_LOGIN_BUTTON);
        return DynamicPageGenerateMange.getHomePage(driver);
    }

    public DynamicHomePageObject logInNopcommerce(JsonReader jsonReader) {
        inputEmail(jsonReader.getEmail());
        inputPassword(jsonReader.getPassword());
        clickLogInButton();
        return DynamicPageGenerateMange.getHomePage(driver);
    }

    public void getEmailError() {
        waitForDynamicElementVisible(driver, DynamicLogInPageUI.DYNAMIC_EMAIL_ERROR);
        getTextOfDynamicElement(driver, DynamicLogInPageUI.DYNAMIC_EMAIL_ERROR);
    }

    public void getInvalidCredential() {
        waitForDynamicElementVisible(driver, DynamicLogInPageUI.DYNAMIC_INVALIDCREDENTIAL_MESSAGE);
        getTextOfDynamicElement(driver, DynamicLogInPageUI.DYNAMIC_INVALIDCREDENTIAL_MESSAGE);
    }
}
