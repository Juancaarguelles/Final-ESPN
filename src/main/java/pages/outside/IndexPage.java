package pages.outside;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class IndexPage extends BasePage
{

    public IndexPage(WebDriver driver, String url) {
        super(driver);
        this.getDriver().get(url);
    }


}
