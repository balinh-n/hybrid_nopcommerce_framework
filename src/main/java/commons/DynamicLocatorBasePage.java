package commons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLocatorBasePage {

    public By getDynamicLocator(String locatorType) {
        By by = null;
        if (locatorType.startsWith("xpath") || locatorType.startsWith("XPATH")) {
            by = By.xpath(locatorType.substring(6));
        }
        if (locatorType.startsWith("css") || locatorType.startsWith("CSS")) {
            by = By.cssSelector(locatorType.substring(4));
        }
        if (locatorType.startsWith("class") || locatorType.startsWith("CLASS")) {
            by = By.className(locatorType.substring(6));
        }
        if (locatorType.startsWith("id") || locatorType.startsWith("ID")) {
            by = By.id(locatorType.substring(3));
        }
        if (locatorType.startsWith("name") || locatorType.startsWith("NAME")) {
            by = By.name(locatorType.substring(5));
        }
        if (locatorType.startsWith("tag") || locatorType.startsWith("TAG")) {
            by = By.tagName(locatorType.substring(4));
        }
        return by;
    }

    public WebElement getDynamicElement(WebDriver driver, String locator) {
        return driver.findElement(getDynamicLocator(locator));
    }

    public void clickToDynamicElement(WebDriver driver, String locator) {
        getDynamicElement(driver, locator).click();
    }

    public void sendTextToDynamicElement(WebDriver driver, String locator, String valueText) {
        getDynamicElement(driver, locator).sendKeys(valueText);
    }

    public String getTextOfDynamicElement(WebDriver driver, String locator) {
        return getDynamicElement(driver, locator).getText();
    }
        public void waitForDynamicElementVisible(WebDriver driver, String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT))
                .until(ExpectedConditions.visibilityOfElementLocated(getDynamicLocator(locator)));
    }

    public void waitForDynamicElementSelected(WebDriver driver, String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT))
                .until(ExpectedConditions.elementToBeSelected(getDynamicLocator(locator)));
    }

    public void waitForDynamicElementClickable(WebDriver driver, String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT))
                .until(ExpectedConditions.elementToBeClickable(getDynamicLocator(locator)));
    }

    public String stringFormat(String locator, String... replaceText) {
        String replaceLocator = String.format(locator, (Object[]) replaceText);
        return replaceLocator;
    }

    public void clickToFormatElement(WebDriver driver, String locator, String replaceText) {
        getDynamicElement(driver, stringFormat(locator, replaceText)).click();
    }
}
