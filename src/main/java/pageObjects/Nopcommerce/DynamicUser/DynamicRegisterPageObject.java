package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.Nopcommerce.DynamicUser.DynamicRegisterPageUI;

public class DynamicRegisterPageObject extends BasePage {
    WebDriver driver;

    public DynamicRegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Input first name = {0}")
    public void inputFirstName(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_TEXTBOX, valueText);
    }

    @Step("Input last name = {0}")
    public void inputLastName(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_TEXTBOX, valueText);
    }

    @Step("Input email = {0}")
    public void inputEmail(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_TEXTBOX, valueText);
    }

    @Step("Input password = {0}")
    public void inputPassword(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_TEXTBOX, valueText);
    }

    @Step("Input confirm password = {0}")
    public void inputConfirmPassword(String valueText) {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_CFMPASSWORD_TEXTBOX);
        sendTextToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_CFMPASSWORD_TEXTBOX, valueText);
    }

    @Step("Click the register button")
    public void clickRegisterButton() {
        waitForDynamicElementClickable(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_BUTTON);
        clickToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_BUTTON);
    }

    @Step("click Nopcommerce image")
    public DynamicHomePageObject clickNopcomerceImage() {
        waitForDynamicElementClickable(driver, DynamicRegisterPageUI.DYNAMIC_IMG_LINK);
        clickToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_IMG_LINK);
        return DynamicPageGenerateMange.getHomePage(driver);
    }

    @Step("Click continue button and return Home Page Object")
    public DynamicHomePageObject clickContinueButton() {
        waitForDynamicElementClickable(driver, DynamicRegisterPageUI.DYNAMIC_CONTINUE_LINK);
        clickToDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_CONTINUE_LINK);
        return DynamicPageGenerateMange.getHomePage(driver);
    }

    @Step("Get First Name error message")
    public String getFirstNameError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_FIRSTNAME_ERROR);
    }

    @Step("Get Last Name error message")
    public String getLastNameError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_LASTNAME_ERROR);
    }

    @Step("Get Email error message")
    public String getEmailError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_ERROR);
    }

    @Step("Get Email validattion error message")
    public String getEmailValidation() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_VALIDATION);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_EMAIL_VALIDATION);
    }

    @Step("Get Password error message")
    public String getPasswordError() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_ERROR);
    }

    @Step("Get Password validattion error message")
    public String getPasswordValidation() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_VALIDATION_ERROR);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_PASSWORD_VALIDATION_ERROR);
    }

    @Step("Get register successfully message")
    public String getRegisterMessage() {
        waitForDynamicElementVisible(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_SUCCESSFUL_MESSAGE);
        return getTextOfDynamicElement(driver, DynamicRegisterPageUI.DYNAMIC_REGISTER_SUCCESSFUL_MESSAGE);
    }
}
