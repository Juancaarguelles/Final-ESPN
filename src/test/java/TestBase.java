import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.outside.IndexPage;
import utils.driver.Driver;

public class TestBase
{
    private Driver driver;
    protected IndexPage indexPage;
    protected Logger log;

    @BeforeTest
    @Parameters({"chrome-browser","url"})
    public void beforeTest(String browser, String url)
    {
        this.driver = new Driver(browser);
        this.driver.getDriver().manage().window().maximize();
        this.indexPage = new IndexPage(this.driver.getDriver(), url);
    }

    @AfterTest
    public void afterTest()
    {
        this.indexPage.dispose();
    }
}
