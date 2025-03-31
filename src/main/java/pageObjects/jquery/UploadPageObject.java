package pageObjects.jquery;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.jquery.UploadPageUI;

public class UploadPageObject extends BasePage {

    WebDriver driver;

    public UploadPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void sendImage(String... fileName) {
        uploadFile(driver, UploadPageUI.ADDFILE_BUTTON, fileName);
    }

    public void checkImageUpload(String... replaceText) {
        waitForFormatElementVisible(driver, UploadPageUI.FILE_UPLOADED, replaceText);
        isDisplay(driver, UploadPageUI.FILE_UPLOADED, replaceText);
    }

    public void clickStartUploadButton(String... replaceText) {
        waitForFormatElementClickable(driver, UploadPageUI.START_UPLOAD_BUTTON, replaceText);
        clickToFormatElement(driver, UploadPageUI.START_UPLOAD_BUTTON, replaceText);
    }
}