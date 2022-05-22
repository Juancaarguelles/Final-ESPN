package pages.inside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class WelcomeUserPage extends BasePage
{

    @FindBy(css = "#global-user-trigger")
    private WebElement accessButton;

    @FindBy(css = ".watch .link-text")
    private WebElement watchButton;
    @FindBy(css = ".global-user-container .account-management .display-user")
    private WebElement welcomeLabel;
    public WelcomeUserPage(WebDriver driver) {
        super(driver);
    }
    public void goToOptions()
    {
        this.waitUntilVisibility(accessButton);
        Actions action = new Actions(this.getDriver());
        action.moveToElement(accessButton).perform();
    }
    public String getWelcomeLabel()
    {
        return this.welcomeLabel.getText();
    }

    public WatchPage goToWatchPage()
    {
        this.waitUntilVisibility(this.watchButton);
        this.watchButton.click();

        return new WatchPage(this.getDriver());
    }
}
