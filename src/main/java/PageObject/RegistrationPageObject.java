package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObject {
    public RegistrationPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_type")
    protected WebElement userType;

    @FindBy(id = "email")
    protected WebElement emailLabel;

    @FindBy(id = "password1")
    protected WebElement passwordField;

    @FindBy(name = "user_data[password2]")
    protected WebElement passConfirmationField;

    @FindBy(name = "user_data[firstname]")
    protected WebElement firstnameInput;

    @FindBy(id = "elm_7")
    protected WebElement lastnameInput;

    @FindBy(name = "dispatch[profiles.update]")
    protected WebElement registrationBtn;

    @FindBy(id = "email_error_message")
    protected WebElement emailErrorMessage;

    @FindBy(id = "password1_error_message")
    protected WebElement passwordErrorMessage;

    @FindBy(id = "password2_error_message")
    protected WebElement passConfirmationErrorMessage;

    public WebElement getUserType() {
        return userType;
    }

    public WebElement getEmailLabel() {
        return emailLabel;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getPassConfirmationField() {
        return passConfirmationField;
    }

    public WebElement getFirstnameInput() {
        return firstnameInput;
    }

    public WebElement getLastnameInput() {
        return lastnameInput;
    }

    public WebElement getRegistrationBtn() {
        return registrationBtn;
    }

    public WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }

    public WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public WebElement getPassConfirmationErrorMessage() {
        return passConfirmationErrorMessage;
    }
}
