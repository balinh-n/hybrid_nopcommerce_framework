package nopcommerce;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.GenerateData;
import pageObjects.Nopcommerce.User.HomePageObject;
import pageObjects.Nopcommerce.User.LogInPageObject;
import pageObjects.Nopcommerce.User.RegisterPageObject;
import testData.UserInfo;

public class LV22_POJO {
    WebDriver driver;
    public HomePageObject homePage;
    public RegisterPageObject registerPage;
    public LogInPageObject loginPage;
    public UserInfo userInfo;
    public GenerateData generateData;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("http://localhost:59580/");
        userInfo = UserInfo.getUserInfo();
        userInfo.setFirstName("Jack");
        userInfo.setLastName("Sparrow");
        userInfo.setEmail("admin" + new Random().nextInt(4)+ "@gmail.com");
        userInfo.setPassword("Abcd1234@");
    }

    @Test
    public void TC6_RegisterSuccressfully() {
        homePage = new HomePageObject(driver);
        homePage.clickRegisterLink();
        registerPage = new RegisterPageObject(driver);
        registerPage.inputFirstName(userInfo.getFirstName());
        registerPage.inputLastName(userInfo.getLastName());
        registerPage.inputEmail(userInfo.getEmail());
        registerPage.inputPassword(userInfo.getPassword());
        registerPage.inputConfirmPassword(userInfo.getPassword());
        registerPage.clickRegisterButton();
        Assert.assertEquals("Your registration completed", registerPage.getRegisterMessage().trim());
        registerPage.clickContinueButton();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
