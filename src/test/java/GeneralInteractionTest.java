import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
    }

    @Test(description = "create account", priority = 0,
    dataProviderClass = UserData.class, dataProvider = "user")
    public void createAccount(String firstName, String lastName, String email, String password)
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.printf(password);
    }

}
