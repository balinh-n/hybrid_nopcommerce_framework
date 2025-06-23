package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.User.HomePageObject;
import pageObjects.Nopcommerce.User.LogInPageObject;
import pageObjects.Nopcommerce.User.RegisterPageObject;
import testData.UserInfo;

public class LV22_POJO_reduce extends BaseTest{
    WebDriver driver;
    public HomePageObject homePage;
    public RegisterPageObject registerPage;
    public LogInPageObject loginPage;
    public UserInfo userInfo;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowser(browser,GlobalConstants.USER_URL);
        userInfo = UserInfo.getUserInfo();
        userInfo.setFirstName("Jack");
        userInfo.setLastName("Sparrow");
        userInfo.setEmail(new Faker().internet().safeEmailAddress());
        System.out.println(userInfo.getEmail());
        userInfo.setPassword("Abcd1234@");
    }

    @Test
    public void TC6_RegisterSuccressfully() {
        homePage = new HomePageObject(driver);
        homePage.clickRegisterLink();
        registerPage = new RegisterPageObject(driver);
        registerPage.registerPage(userInfo);
        Assert.assertEquals("Your registration completed", registerPage.getRegisterMessage().trim());
        registerPage.clickContinueButton();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
