package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.DynamicUser.DynamicRegisterPageUI;

public class DynamicRegisterPageObject extends BasePage{
    WebDriver driver;

    public DynamicRegisterPageObject(WebDriver driver) {
            this.driver = driver;
    }
    public void inputFirstName(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_TEXTBOX, valueText);
    }

    public void inputLastName(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_TEXTBOX, valueText);
    }

    public void inputEmail(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_TEXTBOX, valueText);
    }

    public void inputPassword(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_TEXTBOX, valueText);
    }

    public void inputConfirmPassword(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_CFMPASSWORD_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_CFMPASSWORD_TEXTBOX, valueText);
    }

    public void clickRegisterButton() {
        waitForDynamicElementClickable(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_BUTTON);
        clickToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_BUTTON);
    }

    public DynamicHomePageObject clickNopcomerceImage() {
        waitForDynamicElementClickable(driver, DynamicRegisterPageUI.DYNAMIC_IMG_LINK);
        clickToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_IMG_LINK);
        return DynamicPageGenerateMange.getHomePage(driver);
    }

    public DynamicHomePageObject clickContinueButton() {
        waitForDynamicElementClickable(driver, DynamicRegisterPageUI.DYNAMIC_CONTINUE_LINK);
        clickToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_CONTINUE_LINK);
        return DynamicPageGenerateMange.getHomePage(driver);
    }

    public String getFirstNameError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_ERROR);
    }

    public String getLastNameError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_ERROR);
    }

    public String getEmailError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_ERROR);
    }

    public String getEmailValidation() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_VALIDATION);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_VALIDATION);
    }
    public String getPasswordError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_ERROR);
    }

    public String getPasswordValidation() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_VALIDATION_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_VALIDATION_ERROR);
    }

    public String getRegisterMessage() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_SUCCESSFUL_MESSAGE);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_SUCCESSFUL_MESSAGE);
    }
}
