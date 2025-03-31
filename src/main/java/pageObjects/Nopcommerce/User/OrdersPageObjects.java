package pageObjects.Nopcommerce.User;

import org.openqa.selenium.WebDriver;

public class OrdersPageObjects extends MyaccountPageObject{
    WebDriver driver;

    public OrdersPageObjects(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}