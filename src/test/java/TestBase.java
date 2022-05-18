import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;
import pages.outside.IndexPage;
import utils.driver.Driver;

public class TestBase
{
    private Driver driver;
    protected IndexPage indexPage;
    protected Logger log;

    @BeforeSuite
    @Parameters({"chrome-browser","url"})
    public void beforeSuite(String browser, String url)
    {
        this.driver = new Driver(browser);
        this.driver.getDriver().manage().window().maximize();
        this.indexPage = new IndexPage(this.driver.getDriver(), url);
    }

    //@AfterSuite
    public void afterSuite()
    {
        this.indexPage.dispose();
    }
}
