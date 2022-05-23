package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.wait = new WebDriverWait(this.driver, 20);
    }

    public WebDriver getDriver()
    {
        return this.driver;
    }

    public void dispose()
    {
        if(this.driver != null)
            this.driver.quit();
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void waitUntilVisibility(WebElement webElement)
    {
        this.wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilBeClickeable(WebElement webElement)
    {
        this.wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public boolean elementExists(WebElement webElement)
    {
        return  webElement != null;
    }
}
