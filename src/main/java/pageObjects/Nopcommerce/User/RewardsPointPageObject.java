package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

public class RewardsPointPageObject extends MyaccountPageObject{
    WebDriver driver;

    public RewardsPointPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
