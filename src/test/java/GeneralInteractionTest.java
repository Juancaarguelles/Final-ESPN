import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.inside.SingleCardPage;
import pages.inside.WatchPage;
import pages.inside.WelcomeUserPage;
import pages.outside.AccessPage;
import pages.outside.SignUpPage;
import utils.data.UserData;

public class GeneralInteractionTest extends TestBase
{
    private AccessPage accessPage;
    private SignUpPage signUpPage;
    private WelcomeUserPage welcomeUserPage;
    private SingleCardPage singleCardPage;

    private WatchPage watchPage;
    @BeforeClass
    public void redirectTo()
    {
        this.indexPage.goToOptions();
        this.accessPage = this.indexPage.goToAccess();
        this.signUpPage = this.accessPage.goToSignUp();
    }

    @Test(description = "create account and sign up", priority = 0,
    dataProviderClass = UserData.class, dataProvider = "user")
    public void createAccount(String firstName, String lastName, String email, String password)
    {
        this.welcomeUserPage = this.signUpPage.goToWelcomeUserPage(firstName, lastName, email, password);
        this.welcomeUserPage.goToOptions();
        Assert.assertFalse(this.welcomeUserPage.getWelcomeLabel().equals("Welcome!"), "Not signed up");
    }

    @Test(description = "Go to watch page and validate that carousel exists with the basic content card", priority = 1)
    public void validateCarouselExistsAndHasContentCard()
    {
        this.watchPage = this.welcomeUserPage.goToWatchPage();
        Assert.assertEquals(watchPage.getCarouselRole(), "listbox", "There is no carousel here");
        Assert.assertTrue(!watchPage.getCardTitle().equals(null), "There is no title attached");
        Assert.assertTrue(!watchPage.getCardDescription().equals(null), "There is no description attached");
    }

    @Test(description = "Open single card and validate that exists close button", priority = 2)
    public void validateClosedButtonInSingleCard()
    {
        this.singleCardPage = this.watchPage.goToSingleCardPage();
        Assert.assertTrue(this.singleCardPage.closedButtonExits(), "Closed button doesn´t exist");
    }

    @Test(description = "Click on closed button of the selected card", priority =  3)
    public void closeCardUI()
    {
        this.watchPage = this.singleCardPage.clickCloseButton();
        Assert.assertEquals(watchPage.getCarouselRole(), "listbox", "There is no carousel here");
    }
}
