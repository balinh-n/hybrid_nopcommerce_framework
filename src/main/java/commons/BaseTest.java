package commons;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BaseTest {
    WebDriver driver;
    private Logger log;

    public BaseTest() {
        log = LogManager.getLogger();
    }

    protected WebDriver getBrowserDriver(String browserName, String url) {
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        if (browserList == BrowserList.CHROME) {
            driver = new ChromeDriver();
        } else if (browserList == BrowserList.EDGE) {
            driver = new EdgeDriver();
        } else if (browserList == BrowserList.FIREFOX) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Not a valid browser name");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public String getRandomEmail(int number) {
        return RandomStringUtils.randomAlphanumeric(number) + "@gmail.com";
    }

    public String getRandomText(int number) {
        return RandomStringUtils.randomAlphabetic(number);
    }

    protected boolean verifyTrue(boolean condition) {
        boolean status = true;
        try {
            log.info("Passed");
            Assert.assertTrue(condition);
        } catch (Throwable e) {
            status = false;
            log.info("Failed");
            VerificatiOnFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return status;
    }

    protected boolean verifyFalse(boolean condition) {
        boolean status = true;
        try {
            log.info("Passed");
            Assert.assertFalse(condition);
        } catch (Throwable e) {
            status = false;
            log.info("Failed");
            VerificatiOnFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return status;
    }

    protected boolean verifyEquals(Object expect, Object actual) {
        boolean status = true;
        try {
            log.info("Passed");
            Assert.assertEquals(expect, actual);
        } catch (Throwable e) {
            status = false;
            log.info("Failed");
            VerificatiOnFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return status;
    }
}
