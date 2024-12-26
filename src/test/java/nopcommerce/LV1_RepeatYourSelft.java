package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageUIs.nopcommerce.users.HomePageUI;
import pageUIs.nopcommerce.users.RegisterPageUI;

public class LV1_RepeatYourSelft {

    WebDriver driver;

    @BeforeMethod
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://localhost:5001/");
    }

    @Test
    public void TC01_Register_EmptyData() {
        driver.findElement(By.xpath(HomePageUI.REGISTER_LINK)).click();
        driver.findElement(By.xpath(RegisterPageUI.REGISTER_BUTTON)).click();
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
