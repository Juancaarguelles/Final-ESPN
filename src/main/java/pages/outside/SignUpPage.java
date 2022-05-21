package pages.outside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SignUpPage extends BasePage
{
    @FindBy(css = ".form-section .title>span")
    private WebElement signUpTitle;
    @FindBy(css = ".form-section .input-wrapper .input-InputFirstName")
    private WebElement nameInput;
    @FindBy(css = ".form-section .input-wrapper .input-InputLastName")
    private WebElement lastNameInput;
    @FindBy(css = ".form-section .input-wrapper .input-InputEmail")
    private WebElement emailInput;
    @FindBy(css = ".form-section .input-wrapper .input-password-new")
    private WebElement passwordInput;
    @FindBy(css = ".view .form-section .btn-submit")
    private WebElement signUpButton;
    @FindBy(css = ".btn-close")
    private WebElement closeButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public String getSignUpTitle()
    {
        return this.signUpTitle.getText();
    }
    public String getFirstNameText()
    {
        return this.nameInput.getAttribute("placeholder");
    }

    public String getLastNameText()
    {
        return this.lastNameInput.getAttribute("placeholder");
    }

    public String getEmailText()
    {
        return this.emailInput.getAttribute("placeholder");
    }

    public String getPasswordText()
    {
        return this.passwordInput.getAttribute("placeholder");
    }

    public String getSignUpButtonText()
    {
        return this.signUpButton.getText();
    }

    public String getCloseButtonText()
    {
        return this.closeButton.getAttribute("id");
    }
}
