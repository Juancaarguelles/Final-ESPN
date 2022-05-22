import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
        WatchPage watchPage = this.welcomeUserPage.goToWatchPage();
        Assert.assertEquals(watchPage.getCarouselRole(), "listbox");
        Assert.assertTrue(!watchPage.getCardTitle().equals(null));
        Assert.assertTrue(!watchPage.getCardDescription().equals(null));
    }

    @Test(description = )

}
