package pageObjects.jquery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.jquery.TablePageUI;

public class TablePageObject extends BasePage {
    WebDriver driver;

    public TablePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFemaleSearchBox(String valueText) {
        waitForDynamicElementVisible(driver, TablePageUI.FEMALE_SEARCHBOX);
        sendTextToDynamicElement(driver, TablePageUI.FEMALE_SEARCHBOX, valueText);
        pressKey(driver, Keys.ENTER);
    }

    public void inputCountrySearchBox(String valueText) {
        waitForDynamicElementVisible(driver, TablePageUI.COUNTRY_SEARCHBOX);
        sendTextToDynamicElement(driver, TablePageUI.COUNTRY_SEARCHBOX, valueText);
        pressKey(driver, Keys.ENTER);
    }

    public void inputMaleSearchBox(String valueText) {
        waitForDynamicElementVisible(driver, TablePageUI.MALE_SEARCHBOX);
        sendTextToDynamicElement(driver, TablePageUI.MALE_SEARCHBOX, valueText);
        pressKey(driver, Keys.ENTER);
    }

    public void inputTotalSearchBox(String valueText) {
        waitForDynamicElementVisible(driver, TablePageUI.TOTAL_SEARCHBOX);
        sendTextToDynamicElement(driver, TablePageUI.TOTAL_SEARCHBOX, valueText);
        pressKey(driver, Keys.ENTER);
    }

    public void inputSearchBox(String valueText, String replaceText) {
        sendTextToFormatElement(driver, TablePageUI.RESTPARM_SEARCHBOX, valueText, replaceText);
        pressKeyToElement(driver, TablePageUI.RESTPARM_SEARCHBOX, Keys.ENTER, replaceText);
    }

    public void clickEditButton(String replaceText) {
        waitForFormatElementClickable(driver, TablePageUI.RESPARAM_EDIT_BUTTON, replaceText);
        clickToFormatElement(driver, TablePageUI.RESPARAM_EDIT_BUTTON, replaceText);
    }

    public void clickRemoveButton(String replaceText) {
        waitForFormatElementClickable(driver, TablePageUI.RESPARAM_REMOVE_BUTTON, replaceText);
        clickToFormatElement(driver, TablePageUI.RESPARAM_REMOVE_BUTTON, replaceText);
    }

    public void editDataInEditTable(String valueText, String replaceText) {
        waitForFormatElementVisible(driver, TablePageUI.RESTPRAM_EDIT_INFOMATION, replaceText);
        clearText(driver, TablePageUI.RESTPRAM_EDIT_INFOMATION, replaceText);
        sendTextToFormatElement(driver, TablePageUI.RESTPRAM_EDIT_INFOMATION, valueText, replaceText);
    }

    public void clickOkButton() {
        waitForDynamicElementClickable(driver, TablePageUI.OK_BUTTON);
        clickToDynamicElement(driver, TablePageUI.OK_BUTTON);
    }
}
