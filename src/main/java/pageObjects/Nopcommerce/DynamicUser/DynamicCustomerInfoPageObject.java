package pageObjects.Nopcommerce.DynamicUser;

import org.openqa.selenium.WebDriver;

public class DynamicCustomerInfoPageObject extends DynamicMyaccountPageObject{
    WebDriver driver;

    public DynamicCustomerInfoPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
