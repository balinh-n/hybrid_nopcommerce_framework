package pageObjects.jquery;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void clickDeleteRow(String tableValue) {
        waitForFormatElementClickable(driver, HomePageUI.DELETE_ROW, tableValue);
        clickToFormatElement(driver, HomePageUI.DELETE_ROW, tableValue);
    }

    public void clickEditButton(String tableValue) {
        waitForFormatElementClickable(driver, HomePageUI.EDIT_BUTTON, tableValue);
        clickToFormatElement(driver, HomePageUI.EDIT_BUTTON, tableValue);
    }

    public void sendTextToEditBox(String editColumn, String valueText) {
        waitForFormatElementVisible(driver, HomePageUI.EDIT_DATA, editColumn);
        clearText(driver, HomePageUI.EDIT_DATA,editColumn);
        sendTextToFormatElement(driver, HomePageUI.EDIT_DATA, valueText, editColumn);
    }

    public void clickOKButton() {
        waitForDynamicElementVisible(driver, HomePageUI.OK_BUTTON);
        clickToDynamicElement(driver, HomePageUI.OK_BUTTON);
    }

    public void uploadFiles(String... fileNames) {
        uploadFile(driver, fileNames);
    }

    public boolean isUploaded(String... fileNames) {
        return isDisplay(driver, HomePageUI.FILE_UPLOADED, fileNames);
    }

    public void clickStartButton() {
        List<WebElement> startButtons = getDynamicElements(driver, HomePageUI.START_BUTTON);
        for (WebElement startButton : startButtons) {
            startButton.click();
        }
    }

    public boolean isUploadedSucess(String... fileNames) {
        return isDisplay(driver, HomePageUI.UPLOAD_SUCCESSFUL, fileNames);
    }
}
