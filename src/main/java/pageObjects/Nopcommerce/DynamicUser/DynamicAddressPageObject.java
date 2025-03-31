package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

public class DynamicAddressPageObject extends DynamicMyaccountPageObject{

    WebDriver driver;
    public DynamicAddressPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    
}
