package nopcommerce;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicLogInPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;

public class LogInNopcommerce extends BaseTest {

    WebDriver driver;
    public static Set<Cookie> nopcommerceCookies;
    public DynamicHomePageObject homePage;
    public DynamicLogInPageObject loginPage;

    @Parameters("browser")
    @BeforeTest
    public void beforeTest(String browser) {
        driver = openBrowser(browser, GlobalConstants.USER_URL);
        homePage = DynamicPageGenerateMange.getHomePage(driver);

        loginPage = homePage.clickLogInLink();
        loginPage.inputEmail("admin@mystore.com");
        loginPage.inputPassword("abcd1234");
        homePage = loginPage.clickLogInButton();

        nopcommerceCookies = homePage.getCookies(driver);
        System.out.println(nopcommerceCookies);
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
