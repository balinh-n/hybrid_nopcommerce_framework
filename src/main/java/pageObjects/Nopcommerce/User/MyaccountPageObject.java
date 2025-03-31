package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.Nopcommerce.User.MyaccountPageUI;

public class MyaccountPageObject extends BasePage{

    WebDriver driver;
    
    public MyaccountPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public CustomerInfoPageObject clickCustomerInfoLink() {
        waitForElementClickable(driver, MyaccountPageUI.CUSTOMER_INFO_LINK);
        clickToElement(driver, MyaccountPageUI.CUSTOMER_INFO_LINK);
        return PageGenerateManage.getCustomerInfoPage(driver);
    }
    public AddressPageObject clickAddressPageLink() {
        waitForElementClickable(driver, MyaccountPageUI.ADDRESS_LINK);
        clickToElement(driver, MyaccountPageUI.ADDRESS_LINK);
        return PageGenerateManage.getAddressPage(driver);
    }
    public OrdersPageObjects clickOrdersLink() {
        waitForElementClickable(driver, MyaccountPageUI.ORDER_LINK);
        clickToElement(driver, MyaccountPageUI.ORDER_LINK);
        return PageGenerateManage.getOrdersPage(driver);
    }
    public RewardsPointPageObject clickRewardsPointLink() {
        waitForElementClickable(driver, MyaccountPageUI.REWARD_POINT_LINK);
        clickToElement(driver, MyaccountPageUI.REWARD_POINT_LINK);
        return PageGenerateManage.getRewardsPointPage(driver);
    }
}
