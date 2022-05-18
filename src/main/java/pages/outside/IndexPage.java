package pages.outside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class IndexPage extends BasePage
{

    @FindBy(css = "#global-user-trigger")
    private WebElement accessButton;
    @FindBy(css = ".tools .account-management li:nth-child(7)>a")
    private WebElement loginButton;
    @FindBy(css = ".tools .account-management li:nth-child(1)")
    private WebElement welcomeLabel;

    public IndexPage(WebDriver driver, String url) {
        super(driver);
        this.getDriver().get(url);
    }

    public void goToOptions()
    {
        this.waitUntilVisibility(accessButton);
        Actions action = new Actions(this.getDriver());
        action.moveToElement(accessButton).perform();
    }

    public AccessPage goToAccess()
    {
        this.waitUntilBeClickeable(loginButton);
        this.loginButton.click();
        return new AccessPage(this.getDriver());
    }

}
