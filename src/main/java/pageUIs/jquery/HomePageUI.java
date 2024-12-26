package pageUIs.jquery;

public class HomePageUI {

    public static final String PAGING = "xpath=//li[@class= 'qgrd-pagination-page']/a[text() = '%s']";
    public static final String HEADER_TEXTBOX = "xpath=//div[@class = 'qgrd-header-text' and text()= '%s']//parent::div/following-sibling::input";
    public static final String DATA_ROW = "xpath=//td[@data-key='females' and text() ='%s']/following-sibling::td[@data-key='country' and text() = '%s']//following-sibling::td[@data-key='males' and text() = '%s']//following-sibling::td[@data-key='total' and text() = '%s']";
}