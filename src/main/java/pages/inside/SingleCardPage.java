package pages.inside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SingleCardPage extends BasePage
{

    @FindBy(css = ".lightbox__contentBox")
    private WebElement cardModal;
    @FindBy(css = ".lightbox__contentBox .lightbox__header .lightbox__closebtn")
    private WebElement closeButton;

    public SingleCardPage(WebDriver driver) {
        super(driver);
    }

    public boolean closedButtonExits()
    {
        return this.elementExists(this.closeButton);
    }

    public WatchPage clickCloseButton()
    {
        this.waitUntilVisibility(this.cardModal);
        this.waitUntilBeClickeable(this.closeButton);
        this.closeButton.click();

        return new WatchPage(this.getDriver());
    }
}
