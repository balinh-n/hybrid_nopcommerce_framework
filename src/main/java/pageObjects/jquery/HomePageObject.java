package pageObjects.jquery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.jquery.HomePageUI;

public class HomePageObject extends BasePage {
    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void openPaging(String pagingNumber) {
        waitForFormatElementVisible(driver, HomePageUI.PAGING, pagingNumber);
        clickToFormatElement(driver, HomePageUI.PAGING, pagingNumber);
    }

    public boolean isPageActivated(String attributeName, String pagingNumber) {
        waitForFormatElementVisible(driver, HomePageUI.PAGING, pagingNumber);
        return getFormatAttribute(driver, HomePageUI.PAGING, attributeName, pagingNumber).endsWith("active");
    }

    public void sendTextToTableHeader(String headerName, String valueText) {
        waitForFormatElementVisible(driver, HomePageUI.HEADER_TEXTBOX, headerName);
        sendTextToFormatElement(driver, HomePageUI.HEADER_TEXTBOX, valueText, headerName);
        pressKeyToElement(driver, HomePageUI.HEADER_TEXTBOX, Keys.ENTER, headerName);
    }

    public boolean isRowDataDisplay(String female, String country, String male, String total) {
        waitForFormatElementVisible(driver, HomePageUI.DATA_ROW, female, country, male, total);
        return isDisplay(driver, HomePageUI.DATA_ROW, female, country, male, total);
    }
}
