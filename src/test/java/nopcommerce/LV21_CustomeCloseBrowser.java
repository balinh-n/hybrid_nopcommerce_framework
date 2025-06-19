package nopcommerce;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.Nopcommerce.DynamicUser.DynamicHomePageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicLogInPageObject;
import pageObjects.Nopcommerce.DynamicUser.DynamicPageGenerateMange;
import pageObjects.Nopcommerce.DynamicUser.DynamicRegisterPageObject;

public class LV21_CustomeCloseBrowser extends BaseTest {
    WebDriver driver;
    public DynamicHomePageObject homePage;
    public DynamicRegisterPageObject registerPage;
    public DynamicLogInPageObject loginPage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowserWithEnum(browser, GlobalConstants.USER_URL);
        homePage = DynamicPageGenerateMange.getHomePage(driver);
    }

    @Test
    public void TC1_RegisterEmptyData() {
        registerPage = homePage.clickRegisterLink();
        registerPage.clickRegisterButton();
        Assert.assertEquals("First name is required.", registerPage.getFirstNameError());
        Assert.assertEquals("Last name is required.", registerPage.getLastNameError());
        Assert.assertEquals("Email is required.", registerPage.getEmailError());
        Assert.assertEquals("Password is required.", registerPage.getPasswordError());
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowserDriver() {
        String cmd = null;
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            log.info("OS name = " + osName);

            String driverInstanceName = driver.toString().toLowerCase();
            log.info("Driver instance name = " + driverInstanceName);

            String browserDriverName = null;

            if (driverInstanceName.contains("chrome")) {
                browserDriverName = "chromedriver";
            } else if (driverInstanceName.contains("internetexplorer")) {
                browserDriverName = "IEDriverServer";
            } else if (driverInstanceName.contains("firefox")) {
                browserDriverName = "geckodriver";
            } else if (driverInstanceName.contains("edge")) {
                browserDriverName = "msedgedriver";
            } else if (driverInstanceName.contains("opera")) {
                browserDriverName = "operadriver";
            } else {
                browserDriverName = "safaridriver";
            }

            if (osName.contains("window")) {
                cmd = "taskkill /F /FI \"IMAGENAME eq " + browserDriverName + "*\"";
            } else {
                cmd = "pkill " + browserDriverName;
            }

            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            try {
                Process process = Runtime.getRuntime().exec(cmd);
                process.waitFor();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
