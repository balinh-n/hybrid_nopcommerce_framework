package pageObjects.nopcommerce.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObjects.nopcommerce.PageGenerateManager;
import pageUIs.nopcommerce.admin.AdminLogInPageUI;

public class AdminLoginPageObject extends BasePage {
    WebDriver driver;

    public AdminLoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void sendTextToEmail(String valueText) {
        waitForElementVisible(driver, AdminLogInPageUI.EMAIL_TEXTBOX);
        sendTextToElement(driver, AdminLogInPageUI.EMAIL_TEXTBOX, valueText);
    }

    public void sendTextToPassword(String valueText) {
        waitForElementVisible(driver, AdminLogInPageUI.PASSWORD_TEXTBOX);
        sendTextToElement(driver, AdminLogInPageUI.PASSWORD_TEXTBOX, valueText);
    }

    public AdminDashboardPageObject clickLoginButton() {
        waitForElementClickable(driver, AdminLogInPageUI.LOGIN_BUTTON);
        clickToElement(driver, AdminLogInPageUI.LOGIN_BUTTON);
        return PageGenerateManager.getAdminDashBoardPage(driver);
    }
}
