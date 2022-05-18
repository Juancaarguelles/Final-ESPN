package pages.outside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AccessPage extends BasePage
{
    @FindBy(css = ".view .form-section .header .logo-primary")
    private WebElement espnLogo;
    @FindBy(css = ".loading-container .view-starry-night .form-section .BtnSubmitSet>button")
    private WebElement loginButton;
    @FindBy(css = ".loading-container .view-starry-night .form-section .btn-secondary")
    private WebElement signUpButton;

    public AccessPage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().switchTo().frame("oneid-iframe");
    }

    public String getLogoText()
    {
        return this.espnLogo.getText();
    }

    public String getLogInButtonText()
    {
        return this.loginButton.getText();
    }

    public String getSignUpButtonText()
    {
        return this.signUpButton.getText();
    }

    public String getLogoAttribute()
    {
        return this.espnLogo.getAttribute("role");
    }
}
