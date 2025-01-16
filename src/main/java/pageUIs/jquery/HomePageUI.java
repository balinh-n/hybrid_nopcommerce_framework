package pageUIs.jquery;

public class HomePageUI {

    public static final String PAGING = "xpath=//li[@class= 'qgrd-pagination-page']/a[text() = '%s']";
    public static final String HEADER_TEXTBOX = "xpath=//div[@class = 'qgrd-header-text' and text()= '%s']//parent::div/following-sibling::input";
    public static final String DATA_ROW = "xpath=//td[@data-key='females' and text() ='%s']/following-sibling::td[@data-key='country' and text() = '%s']//following-sibling::td[@data-key='males' and text() = '%s']//following-sibling::td[@data-key='total' and text() = '%s']";
    public static final String DELETE_ROW = "xpath=//td[@data-key='country' and text() ='%s']/preceding-sibling::td//button[@class='qgrd-remove-row-btn']";
    public static final String EDIT_BUTTON = "xpath=//td[@data-key='country' and text() ='%s']/preceding-sibling::td//button[@class='qgrd-edit-row-btn']";
    public static final String EDIT_DATA = "xpath=//div[@class='qgrd-modal-container']//div[@class='qgrd-modal-content']//input[@name='%s']";
    public static final String OK_BUTTON = "xpath=//input[@type='submit']";

    public static final String UPLOAD_BUTTON = "xpath=//input[@type='file']";  
    public static final String FILE_UPLOADED = "xpath=//p[@class='name' and text() = '%s']";
    public static final String START_BUTTON = "css=td>button.start";
    public static final String UPLOAD_SUCCESSFUL = "xpath=//p[@class='name']/a[@title='%s']";
}