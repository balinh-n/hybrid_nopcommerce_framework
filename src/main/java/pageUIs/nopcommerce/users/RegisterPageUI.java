package pageUIs.nopcommerce.users;

public class RegisterPageUI {

    public static final String FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";
    public static final String LASTNAME_TEXTBOX = "//input[@id='LastName']";
    public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
    public static final String PASSWORD_TEXTBOX = "//input[@id='Password']";
    public static final String CFMPASSWORD_TEXTBOX = "//input[@id='ConfirmPassword']";
    public static final String REGISTER_BUTTON = "//button[@id='register-button']";
    public static final String IMG_LINK = "//img[@alt='Your store name']";
    public static final String CONTINUE_LINK = "//a[text() ='Continue']";

    public static final String FIRSTNAME_ERROR = "//span[@id='FirstName-error']";
    public static final String LASTNAME_ERROR = "//span[@id='LastName-error']";
    public static final String EMAIL_ERROR = "//span[@id='Email-error']";
    public static final String PASSWORD_ERROR = "//span[@id='ConfirmPassword-error']";
    public static final String PASSWORD_VALIDATION_ERROR = "//span[@class='field-validation-error']";
    public static final String REGISTER_SUCCESSFULL_MESSAGE = "//div[@class='result']";
    public static final String EMAIL_VALIDATION = "//div[@class='message-error validation-summary-errors']//li";

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
    public static final String DYNAMIC_PASSWORD_VALIDATION_ERROR = "class=field-validation-error";
    public static final String DYNAMIC_REGISTER_SUCCESSFULL_MESSAGE = "class=result";
    public static final String DYNAMIC_EMAIL_VALIDATION = "xpath=//div[@class='message-error validation-summary-errors']//li";
}
