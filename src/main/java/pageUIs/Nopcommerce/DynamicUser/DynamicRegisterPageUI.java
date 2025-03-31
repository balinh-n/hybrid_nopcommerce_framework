package pageUIs.Nopcommerce.DynamicUser;

public class DynamicRegisterPageUI {
    public static final String DYNAMIC_FIRSTNAME_TEXTBOX = "id=FirstName";
    public static final String DYNAMIC_LASTNAME_TEXTBOX = "ID=LastName";
    public static final String DYNAMIC_EMAIL_TEXTBOX = "xpath=//input[@id='Email']";
    public static final String DYNAMIC_PASSWORD_TEXTBOX = "XPATH=//input[@id='Password']";
    public static final String DYNAMIC_CFMPASSWORD_TEXTBOX = "name=ConfirmPassword";
    public static final String DYNAMIC_REGISTER_BUTTON = "name=register-button";
    public static final String DYNAMIC_IMG_LINK = "xpath=//img[@alt='Your store name']";
    public static final String DYNAMIC_CONTINUE_LINK = "xpath=//a[text() ='Continue']";

    public static final String DYNAMIC_FIRSTNAME_ERROR = "id=FirstName-error";
    public static final String DYNAMIC_LASTNAME_ERROR = "id=LastName-error";
    public static final String DYNAMIC_EMAIL_ERROR = "id=Email-error";
    public static final String DYNAMIC_PASSWORD_ERROR = "id=ConfirmPassword-error";
    public static final String DYNAMIC_PASSWORD_VALIDATION_ERROR = "xpath=//span[@id='Password-error']";
    public static final String DYNAMIC_REGISTER_SUCCESSFUL_MESSAGE = "class=result";
    public static final String DYNAMIC_EMAIL_VALIDATION = "xpath=//div[@class='message-error validation-summary-errors']//li";
}
