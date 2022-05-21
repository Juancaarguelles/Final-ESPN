import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.outside.AccessPage;

public class LoginTest extends TestBase
{
    private AccessPage accessPage;

    @BeforeClass
    public void redirectTo()
    {
        this.indexPage.goToOptions();
        this.accessPage = this.indexPage.goToAccess();
    }
    @Test(description = "Find and asserts that logo exists", priority = 0)
    public void findESPNLogo()
    {
        Assert.assertEquals(accessPage.getLogoText(),"Disney account");
        Assert.assertEquals(accessPage.getLogoAttribute(), "img");
    }

    @Test(description = "Find log In Button and asserts that it exists", priority = 1)
    public void findLoginButton()
    {
        Assert.assertEquals(accessPage.getLogInButtonText(), "Log In");
    }

    @Test(description = "Find Sign up button and asserts that it exists", priority = 2)
    public void findSignUpButton()
    {
        Assert.assertEquals(accessPage.getSignUpButtonText(), "Sign Up");
    }


}
