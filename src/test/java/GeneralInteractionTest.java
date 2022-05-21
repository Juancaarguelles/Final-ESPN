import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.inside.WelcomeUserPage;
import pages.outside.AccessPage;
import pages.outside.SignUpPage;

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
    }

    @Test(description = "create account", priority = 0)
    public void createAccount()
    {

    }

}
