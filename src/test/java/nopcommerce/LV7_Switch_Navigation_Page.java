package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.GlobalConstants;
import pageObjects.nopcommerce.PageGenerateManager;
import pageObjects.nopcommerce.users.AddressPageObject;
import pageObjects.nopcommerce.users.CustomerInfoPageObject;
import pageObjects.nopcommerce.users.HomePageObject;
import pageObjects.nopcommerce.users.LoginPageObject;

public class LV7_Switch_Navigation_Page {
    WebDriver driver;
    private HomePageObject getHomePage;
    private LoginPageObject getLoginPage;
    private AddressPageObject getAddressPage;
    private CustomerInfoPageObject getCustomerInfoPage;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://localhost:5001/");
        getHomePage = PageGenerateManager.getHomePage(driver);
    }

    @Test
    public void TC01_Login() {
        getLoginPage = getHomePage.clickLogInLink();
        getLoginPage.sendTextToEmail(GlobalConstants.USEREMAIL);
        getLoginPage.sendTextToPassword(GlobalConstants.USERPASSWORD);
        getHomePage = getLoginPage.clickLoginButton();
        getCustomerInfoPage = getHomePage.clickMyaccountLink();
        getAddressPage = getCustomerInfoPage.clickAddressLink();
        getCustomerInfoPage = getAddressPage.clickCustomerInfoLink();
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
