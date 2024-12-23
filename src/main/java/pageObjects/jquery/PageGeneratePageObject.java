package pageObjects.jquery;

import org.openqa.selenium.WebDriver;

public class PageGeneratePageObject {
    WebDriver driver;

    public PageGeneratePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public static HomePageObject getHomePageObject(WebDriver driver) {
        return new HomePageObject(driver);
    }
}
