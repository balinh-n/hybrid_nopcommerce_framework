package pageObjects.nopcommerce.users;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObjects.nopcommerce.PageGenerateManager;
import pageUIs.users.MyAccountSideBarPageUI;

public class MyAccountSideBarPageObject extends BasePage {
    WebDriver driver;

    public MyAccountSideBarPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public CustomerInfoPageObject clickCustomerInfoLink() {
        waitForElementVisible(driver, MyAccountSideBarPageUI.CUSTOMERINFO_LINK);
        clickToElement(driver, MyAccountSideBarPageUI.CUSTOMERINFO_LINK);
        return PageGenerateManager.getCustomerInfoPage(driver);
    }

    public AddressPageObject clickAddressLink() {
        waitForElementVisible(driver, MyAccountSideBarPageUI.ADDRESS_LINK);
        clickToElement(driver, MyAccountSideBarPageUI.ADDRESS_LINK);
        return PageGenerateManager.getAddressPage(driver);
    }

    public MyAccountSideBarPageObject swithPage(String tabName) {
        waitForDynamicElementClickable(driver, MyAccountSideBarPageUI.DYNAMIC_LOCATOR);
        clickToFormatElement(driver, MyAccountSideBarPageUI.DYNAMIC_LOCATOR, tabName);
        switch (tabName) {
            case "CustomerInfo":
                return PageGenerateManager.getCustomerInfoPage(driver);

            case "Address":
                return PageGenerateManager.getAddressPage(driver);
            default:
                throw new RuntimeException("Please input correct tab name");
        }

    }

    // When have many tab in sidebar
    public void switchPages(String tabName) {
        waitForDynamicElementClickable(driver, tabName);
        clickToFormatElement(driver,MyAccountSideBarPageUI.DYNAMIC_LOCATOR, tabName);
    }
}
