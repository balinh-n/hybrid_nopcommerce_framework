package jquery;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.jquery.HomePageObject;
import pageObjects.jquery.PageGeneratePageObject;

public class LV12_UploadFile extends BasePage {
    WebDriver driver;
    HomePageObject homePage;
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
        homePage = PageGeneratePageObject.getHomePageObject(driver);
    }

    @Test
    public void uploadFileTest() {
        homePage.uploadFiles("download.jpg");
        Assert.assertTrue(homePage.isUploaded("download.jpg"));

        homePage.clickStartButton();
        Assert.assertTrue(homePage.isUploadedSucess("download.jpg"));
    }


    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
