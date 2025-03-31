package jquery;

import commons.BaseTest;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.jquery.UploadPageObject;

public class LV9_UploadFile extends BaseTest {
    WebDriver driver;
    UploadPageObject getUploadPage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowser(browser, GlobalConstants.UPLOAD_URL);
        getUploadPage = new UploadPageObject(driver);
    }

    @Test
    public void TC1_UploadSingleFile() {
        getUploadPage.sendImage("meo.jpg");
        getUploadPage.sleepInSecond(2);
        getUploadPage.refreshPage(driver);
    }

    @Test
    public void TC2_UploadMultipleFile() {
        getUploadPage.sendImage("meo.jpg", "meomeo.jpg", "meomeomeo.jpg");
        getUploadPage.checkImageUpload("meo.jpg", "meomeo.jpg", "meomeomeo.jpg");
    }

    @Test
    public void TC3_StartUploading() {
        getUploadPage.clickStartUploadButton("meo.jpg", "meomeo.jpg", "meomeomeo.jpg");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
