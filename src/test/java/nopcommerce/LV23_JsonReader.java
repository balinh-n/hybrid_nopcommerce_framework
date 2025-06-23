package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicLogInPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;
import testData.JsonReader;

public class LV23_JsonReader extends BaseTest {
    WebDriver driver;
    public DynamicHomePageObject homePage;
    public DynamicLogInPageObject loginPage;
    public JsonReader jsonReader;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowser(browser, GlobalConstants.USER_URL);
        jsonReader = JsonReader.getUserInfo("userInfo.json");
        jsonReader.getEmail();
        jsonReader.getPassword();
        homePage = DynamicPageGenerateMange.getHomePage(driver);
    }

    @Test
    public void TC1_LogInWithValidAccount() {
        loginPage = homePage.clickLogInLink();
        loginPage.logInNopcommerce(jsonReader);
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
}
