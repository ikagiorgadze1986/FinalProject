package StepObject;

import PageObject.RegistrationPageObject;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class RegistrationPageSteps {
    private final RegistrationPageObject registrationPageObject;

    public RegistrationPageSteps(WebDriver driver) {
        this.registrationPageObject = new RegistrationPageObject(driver);
    }

    @Step
    public WebElement getUserTypeElement() {
        return registrationPageObject.getUserType();
    }

    @Step
    public WebElement getEmailElement() {
        return registrationPageObject.getEmailLabel();
    }

    @Step
    public WebElement getPasswordElement() {
        return registrationPageObject.getPasswordField();
    }

    @Step
    public WebElement getPasswordConfirmationElement() {
        return registrationPageObject.getPassConfirmationField();
    }

    @Step
    public WebElement getFirstNameElement() {
        return registrationPageObject.getFirstnameInput();
    }

    @Step
    public WebElement getLastNameElement() {
        return registrationPageObject.getLastnameInput();
    }

    @Step
    public void enterEmail(String text) {
        registrationPageObject.getEmailLabel().sendKeys(text);
    }

    @Step
    public void enterPassword(String text) {
        registrationPageObject.getPasswordField().sendKeys(text);
    }

    @Step
    public void confirmPassword(String text) {
        registrationPageObject.getPassConfirmationField().sendKeys(text);
    }

    @Step
    public void enterFirstname(String text){
        registrationPageObject.getFirstnameInput().sendKeys(text);
    }

    @Step
    public void enterLastname(String text){
        registrationPageObject.getLastnameInput().sendKeys(text);
    }

    @Step
    public void submitRegisterBtn() {
        registrationPageObject.getRegistrationBtn().click();
    }

    @Step
    public String getEmailErrorMessage(){
        return registrationPageObject.getEmailErrorMessage().getText();
    }

    @Step
    public String getPasswordErrorMessage(){
        return registrationPageObject.getPasswordErrorMessage().getText();
    }

    @Step
    public String getPassConfirmationErrorMessage(){
        return registrationPageObject.getPassConfirmationErrorMessage().getText();
    }
}
