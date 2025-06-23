package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.User.RegisterPageUI;
import testData.UserInfo;

public class RegisterPageObject extends BasePage {
    WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String valueText) {
        waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, valueText);
    }

    public void inputLastName(String valueText) {
        waitForElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, valueText);
    }

    public void inputEmail(String valueText) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, valueText);
    }

    public void inputPassword(String valueText) {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, valueText);
    }

    public void inputConfirmPassword(String valueText) {
        waitForElementVisible(driver, RegisterPageUI.CFMPASSWORD_TEXTBOX);
        sendTextToElement(driver, RegisterPageUI.CFMPASSWORD_TEXTBOX, valueText);
    }

    public void clickRegisterButton() {
        waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public HomePageObject clickNopcomerceImage() {
        waitForElementClickable(driver, RegisterPageUI.IMG_LINK);
        clickToElement(driver, RegisterPageUI.IMG_LINK);
        return PageGenerateManage.getHomePage(driver);
    }

    public HomePageObject clickContinueButton() {
        waitForElementClickable(driver, RegisterPageUI.CONTINUE_LINK);
        clickToElement(driver, RegisterPageUI.CONTINUE_LINK);
        return PageGenerateManage.getHomePage(driver);
    }

    public String getFirstNameError() {
        waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_ERROR);
        return getTextOfElement(driver, RegisterPageUI.FIRSTNAME_ERROR);
    }

    public String getLastNameError() {
        waitForElementVisible(driver, RegisterPageUI.LASTNAME_ERROR);
        return getTextOfElement(driver, RegisterPageUI.LASTNAME_ERROR);
    }

    public String getEmailError() {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_ERROR);
        return getTextOfElement(driver, RegisterPageUI.EMAIL_ERROR);
    }

    public String getEmailValidation() {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_VALIDATION);
        return getTextOfElement(driver, RegisterPageUI.EMAIL_VALIDATION);
    }
    public String getPasswordError() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_ERROR);
        return getTextOfElement(driver, RegisterPageUI.PASSWORD_ERROR);
    }

    public String getPasswordValidation() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_VALIDATION_ERROR);
        return getTextOfElement(driver, RegisterPageUI.PASSWORD_VALIDATION_ERROR);
    }

    public String getRegisterMessage() {
        waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESSFUL_MESSAGE);
        return getTextOfElement(driver, RegisterPageUI.REGISTER_SUCCESSFUL_MESSAGE);
    }

    public void registerPage(UserInfo userInfo) {
        inputFirstName(userInfo.getFirstName());
        inputLastName(userInfo.getLastName());
        inputEmail(userInfo.getEmail());
        inputPassword(userInfo.getPassword());
        inputConfirmPassword(userInfo.getPassword());
        clickRegisterButton();
    }
}
