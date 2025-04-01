package commons;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BaseTest {

    WebDriver driver;
    protected Logger log;

    public WebDriver openBrowser(String browser, String url) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please input valid browser name");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public WebDriver openBrowserWithEnum(String browser, String url) {
        BrowserList browserList = BrowserList.valueOf(browser.toUpperCase());
        if (browserList == BrowserList.CHROME) {
            driver = new ChromeDriver();
        } else if (browserList == BrowserList.FIREFOX) {
            driver = new FirefoxDriver();
        } else if (browserList == BrowserList.EDGE) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please input valid browser name");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    protected boolean verifyTrue(boolean condition) {
        boolean status = true;
        try {
            Assert.assertTrue(condition);
            log.info("---------------------- Passed -----------------------");
        } catch (Throwable e) {
            status = false;
            VerificationOnFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
            log.info("---------------------- Failed -----------------------");
        }
        return status;
    }

    protected boolean verifyFalse(boolean condition) {
        boolean status = true;
        try {
            Assert.assertFalse(condition);
            log.info("---------------------- Passed -----------------------");
        } catch (Throwable e) {
            status = false;
            VerificationOnFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
            log.info("---------------------- Failed -----------------------");
        }
        return status;
    }

    protected boolean verifyEquals(Object actual, Object expected) {
        boolean status = true;
        try {
            Assert.assertEquals(actual, expected);
            log.info("---------------------- Passed -----------------------");
        } catch (Throwable e) {
            status = false;
            VerificationOnFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
            log.info("---------------------- Failed -----------------------");
        }
        return status;
    }
}
