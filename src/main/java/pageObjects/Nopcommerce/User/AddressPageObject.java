package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

public class AddressPageObject extends MyaccountPageObject{
    WebDriver driver;

    public AddressPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
