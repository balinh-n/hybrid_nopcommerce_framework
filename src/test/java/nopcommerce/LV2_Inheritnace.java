package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageUIs.nopcommerce.users.HomePageUI;
import pageUIs.nopcommerce.users.RegisterPageUI;

public class LV2_Inheritnace extends BasePage {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://localhost:5001/");
    }

    @Test
    public void TC01_Register_EmptyData() {
        clickToElement(driver, HomePageUI.REGISTER_LINK);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
        Assert.assertEquals(driver.findElement(By.xpath(RegisterPageUI.FIRSTNAME_ERROR)).getText(),
                "First name is required.");
        Assert.assertEquals(driver.findElement(By.xpath(RegisterPageUI.LASTNAME_ERROR)).getText(),
                "Last name is required.");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
