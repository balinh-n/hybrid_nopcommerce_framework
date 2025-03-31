package jquery;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.jquery.TablePageObject;

public class LV8_DataTable extends BaseTest {

    WebDriver driver;
    public TablePageObject getTablePage;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(String browser) {
        driver = openBrowser(browser, GlobalConstants.TABLE_URL);
        getTablePage = new TablePageObject(driver);
    }

    @Test
    public void TC1_SearchInTable() {
        getTablePage.inputFemaleSearchBox("24128");
        getTablePage.refreshPage(driver);
        getTablePage.inputCountrySearchBox("Argentina");
        getTablePage.refreshPage(driver);
        getTablePage.inputMaleSearchBox("16456");
        getTablePage.refreshPage(driver);
        getTablePage.inputTotalSearchBox("687522");
        getTablePage.refreshPage(driver);
    }

    @Test
    public void TC2_SearchInTableByRestParameter() {
        getTablePage.inputSearchBox("24128", "Females");
        getTablePage.refreshPage(driver);
        getTablePage.inputSearchBox("Argentina", "Country");
        getTablePage.refreshPage(driver);
        getTablePage.inputSearchBox("16456", "Males");
        getTablePage.refreshPage(driver);
        getTablePage.inputSearchBox("687522", "Total");
        getTablePage.refreshPage(driver);
    }

    @Test
    public void TC3_EditTableData() {
        getTablePage.clickEditButton("Afghanistan");
        getTablePage.editDataInEditTable("123456", "females");
        getTablePage.clickOkButton();
    }

    @Test
    public void TC4_RemoveTableData() {
        getTablePage.clickRemoveButton("Afghanistan");
        getTablePage.inputSearchBox("Afghanistan", "Country");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
