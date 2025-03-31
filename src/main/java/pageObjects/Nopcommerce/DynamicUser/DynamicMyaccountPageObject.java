package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.DynamicUser.DynamicMyaccountPageUI;

public class DynamicMyaccountPageObject extends BasePage {
    WebDriver driver;

    public DynamicMyaccountPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicMyaccountPageObject clickDynamicTab(String replaceText) {
        waitForFormatElementVisible(driver, DynamicMyaccountPageUI.MYACCOUNT_RESTPARAM, replaceText);
        clickToFormatElement(driver, DynamicMyaccountPageUI.MYACCOUNT_RESTPARAM, replaceText);

        switch (replaceText) {
            case "Customer info":
                return  DynamicPageGenerateMange.getCustomerInfoPage(driver);
            case "Addresses":
                return DynamicPageGenerateMange.getAddressPage(driver);
            default:
            throw new RuntimeException("Please input correct tab name");   
        }
    }
}
