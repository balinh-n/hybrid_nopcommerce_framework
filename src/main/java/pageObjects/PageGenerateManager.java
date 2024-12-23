package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerateManager {

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static DynamicPageObject getDynamicPage(WebDriver driver) {
        return new DynamicPageObject(driver);
    }
}
