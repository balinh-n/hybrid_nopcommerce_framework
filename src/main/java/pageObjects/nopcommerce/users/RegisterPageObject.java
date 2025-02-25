package pageObjects.nopcommerce.users;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObjects.nopcommerce.PageGenerateManager;
import pageUIs.nopcommerce.users.RegisterPageUI;

public class RegisterPageObject extends BasePage {

    WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void sendTextToFirstName(String value) {
        waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, value);
    }

    public void sendTextToLastName(String value) {
        waitForElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, value);
    }

    public void sendTextToEmail(String value) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, value);
    }

    public void sendTextToPassword(String value) {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, value);
    }

    public void sendTextToCfmPassword(String value) {
        waitForElementVisible(driver, RegisterPageUI.CFMPASSWORD_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.CFMPASSWORD_TEXTBOX, value);
    }

    public void clickRegisterButton() {
        waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public HomePageObject clickImageLink() {
        waitForElementClickable(driver, RegisterPageUI.IMG_LINK);
        clickToElement(driver, RegisterPageUI.IMG_LINK);
        return PageGenerateManager.getHomePage(driver);
    }

    public HomePageObject clickContinueLink() {
        waitForElementClickable(driver, RegisterPageUI.CONTINUE_LINK);
        clickToElement(driver, RegisterPageUI.CONTINUE_LINK);
        return PageGenerateManager.getHomePage(driver);
    }

    public String getFirstNameError() {
        return getTextOfElement(driver, RegisterPageUI.FIRSTNAME_ERROR);
    }

    public String getLastNameError() {
        return getTextOfElement(driver, RegisterPageUI.LASTNAME_ERROR);
    }

    public String getEmailError() {
        return getTextOfElement(driver, RegisterPageUI.EMAIL_ERROR);
    }

    public String getPasswordError() {
        return getTextOfElement(driver, RegisterPageUI.PASSWORD_ERROR);
    }

    public String getPasswordValidation() {
        return getTextOfElement(driver, RegisterPageUI.PASSWORD_VALIDATION_ERROR);
    }

    public String getEmailValidation() {
        return getTextOfElement(driver, RegisterPageUI.EMAIL_VALIDATION);
    }

    public String getSuccessMessage() {
        return getTextOfElement(driver, RegisterPageUI.REGISTER_SUCCESSFULL_MESSAGE);
    }

    //Dynamic Locator
    public void sendTextToDynamicFirstName(String value) {
        waitForDynamicElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendTextToDynamicElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, value);
    }

    public void sendTextToDynamicLastName(String value) {
        waitForDynamicElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendTextToDynamicElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, value);
    }

    public void sendTextToDynamicEmail(String value) {
        waitForDynamicElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendTextToDynamicElement(driver, RegisterPageUI.EMAIL_TEXTBOX, value);
    }

    public void sendTextToDynamicPassword(String value) {
        waitForDynamicElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendTextToDynamicElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, value);
    }

    public void sendTextToDynamicCfmPassword(String value) {
        waitForDynamicElementVisible(driver, RegisterPageUI.CFMPASSWORD_TEXTBOX);
        sendTextToDynamicElement(driver, RegisterPageUI.CFMPASSWORD_TEXTBOX, value);
    }

    public void clickDynamicRegisterButton() {
        waitForDynamicElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToDynamicElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public void clickDynamicImageLink() {
        waitForDynamicElementClickable(driver, RegisterPageUI.IMG_LINK);
        clickToDynamicElement(driver, RegisterPageUI.IMG_LINK);
    }

    public void clickDynamicContinueLink() {
        waitForDynamicElementClickable(driver, RegisterPageUI.CONTINUE_LINK);
        clickToDynamicElement(driver, RegisterPageUI.CONTINUE_LINK);
    }

    public String getDynamicFirstNameError() {
        return getTextOfDynamicElement(driver, RegisterPageUI.FIRSTNAME_ERROR);
    }

    public String getDynamicLastNameError() {
        return getTextOfDynamicElement(driver, RegisterPageUI.LASTNAME_ERROR);
    }

    public String getDynamicEmailError() {
        return getTextOfDynamicElement(driver, RegisterPageUI.EMAIL_ERROR);
    }

    public String getDynamicPasswordError() {
        return getTextOfDynamicElement(driver, RegisterPageUI.PASSWORD_ERROR);
    }

    public String getDynamicPasswordValidation() {
        return getTextOfDynamicElement(driver, RegisterPageUI.PASSWORD_VALIDATION_ERROR);
    }

    public String getDynamicEmailValidation() {
        return getTextOfDynamicElement(driver, RegisterPageUI.EMAIL_VALIDATION);
    }

    public String getDynamicSuccessMessage() {
        return getTextOfDynamicElement(driver, RegisterPageUI.REGISTER_SUCCESSFULL_MESSAGE);
    }
}
