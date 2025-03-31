package pageUIs.jquery;

public class TablePageUI {
    public static final String FEMALE_SEARCHBOX = "xpath=//div[text()='Females']/parent::div/following-sibling::input";
    public static final String COUNTRY_SEARCHBOX = "xpath=//div[text()='Country']/parent::div/following-sibling::input";
    public static final String MALE_SEARCHBOX = "xpath=//div[text()='Males']/parent::div/following-sibling::input";
    public static final String TOTAL_SEARCHBOX = "xpath=//div[text()='Total']/parent::div/following-sibling::input";
    public static final String OK_BUTTON = "xpath=//input[@type='submit']";
    public static final String TABLE_LIST = "xpath=//tbody//tr";
    
    public static final String RESTPARM_SEARCHBOX = "xpath=//div[text()='%s']/parent::div/following-sibling::input"; 
    public static final String RESPARAM_EDIT_BUTTON = "xpath=//td[text() = '%s']/preceding-sibling::td//button[@class='qgrd-edit-row-btn']";
    public static final String RESPARAM_REMOVE_BUTTON = "xpath=//td[text() = '%s']/preceding-sibling::td//button[@class='qgrd-remove-row-btn']";
    public static final String RESTPRAM_EDIT_INFOMATION = "xpath=//label[text()='%s']/following-sibling::input";
}
