package jquery;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.jquery.HomePageObject;
import pageObjects.jquery.PageGeneratePageObject;

public class LV11_DataTable {

    WebDriver driver;
    private HomePageObject homePage;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/CRUD-Data-Grid-Plugin-jQuery-Quickgrid/");
        homePage = PageGeneratePageObject.getHomePageObject(driver);
    }

    @Test
    public void Table_01() {
        // navigate to any page
        homePage.openPaging("2");
        Assert.assertTrue(homePage.isPageActivated("class", "2"));
        homePage.openPaging("15");
        Assert.assertTrue(homePage.isPageActivated("class", "15"));
    }

    @Test
    public void Table_02() {
        // Send text to header
        homePage.sendTextToTableHeader("Females", "384187");
        Assert.assertTrue(homePage.isRowDataDisplay("384187", "Afghanistan", "407124", "791312"));
        homePage.refreshPage(driver);

        homePage.sendTextToTableHeader("Country", "Albania");
        Assert.assertTrue(homePage.isRowDataDisplay("24128", "Albania", "25266", "49397"));
        homePage.refreshPage(driver);

        homePage.sendTextToTableHeader("Males", "802948");
        Assert.assertTrue(homePage.isRowDataDisplay("764956", "Arab Rep of Egypt", "802948", "1567904"));
        homePage.refreshPage(driver);

        homePage.sendTextToTableHeader("Total", "1504");
        Assert.assertTrue(homePage.isRowDataDisplay("750", "Aruba", "756", "1504"));
        homePage.refreshPage(driver);
    }

    @Test
    public void Table_03() {
        // Delete a row
        homePage.sendTextToTableHeader("Country", "Afghanistan");
        homePage.clickDeleteRow("Afghanistan");
        homePage.refreshPage(driver);

        //Edit a data
        homePage.clickEditButton("Afghanistan");
        homePage.sendTextToEditBox("females", "10000");
        homePage.clickOKButton();
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
 