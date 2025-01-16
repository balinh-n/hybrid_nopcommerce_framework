package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.GlobalConstants;
import pageObjects.nopcommerce.PageGenerateManager;
import pageObjects.nopcommerce.users.AddressPageObject;
import pageObjects.nopcommerce.users.CustomerInfoPageObject;
import pageObjects.nopcommerce.users.HomePageObject;
import pageObjects.nopcommerce.users.LoginPageObject;

public class LV10_RestParameter {
    WebDriver driver;
    private HomePageObject getHomePage;
    private LoginPageObject getLogInPage;
    private CustomerInfoPageObject getCustomerInfoPage;
    private AddressPageObject getAddressPage;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://localhost:5001/");
        getHomePage = PageGenerateManager.getHomePage(driver);
    }

    @Test
    public void TC1_RestParamter() {
        getLogInPage = getHomePage.clickDynamicLoginLink();
        getLogInPage.sendTextToDynamicEmail(GlobalConstants.USEREMAIL);
        getLogInPage.sendTextToDynamicPass(GlobalConstants.USERPASSWORD);
        getHomePage = getLogInPage.clickDynamicLogInButton();
        getCustomerInfoPage = getHomePage.clickDynamicMyAccountLink();
        // ép kiểu
        getAddressPage = (AddressPageObject) getCustomerInfoPage.swithPage("Address");
        getCustomerInfoPage = (CustomerInfoPageObject) getAddressPage.swithPage("CustomerInfo");

        // khởi tạo trực tiếp
        getCustomerInfoPage.switchPages("Address");
        getAddressPage = PageGenerateManager.getAddressPage(driver);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
