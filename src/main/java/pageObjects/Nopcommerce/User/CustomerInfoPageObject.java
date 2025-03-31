package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

public class CustomerInfoPageObject extends MyaccountPageObject{
    WebDriver driver;

    public CustomerInfoPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
