import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.outside.AccessPage;
import pages.outside.SignUpPage;

public class SignUpTest extends TestBase
{
    private AccessPage accessPage;
    private SignUpPage signUpPage;

    @BeforeClass
    public void redirectTo()
    {
        this.indexPage.goToOptions();
        this.accessPage = this.indexPage.goToAccess();
        this.signUpPage = this.accessPage.goToSignUp();
    }

    @Test(description = "Find the ESPN title of the form", priority = 0)
    public void findESPNTitle()
    {
        Assert.assertEquals(this.signUpPage.getSignUpTitle(), "Create Account");
    }

    @Test(description = "Find the first name placeholder of the form", priority = 1)
    public void findfirstNameText()
    {
        Assert.assertEquals(this.signUpPage.getFirstNameText(), "First Name");
    }

    @Test(description = "Find the last name placeholder of the form", priority = 2)
    public void findlastNameText()
    {
        Assert.assertEquals(this.signUpPage.getLastNameText(), "Last Name");
    }

    @Test(description = "Find the email placeholder of the form", priority = 3)
    public void findEmailText()
    {
        Assert.assertEquals(this.signUpPage.getEmailText(), "Email Address");
    }

    @Test(description = "Find the password placeholder of the form", priority = 4)
    public void findPasswordText()
    {
        Assert.assertEquals(this.signUpPage.getPasswordText(), "Password (case sensitive)");
    }

    @Test(description = "Find the sign up button text of the form", priority = 5)
    public void findSignUpButtonext()
    {
        Assert.assertEquals(this.signUpPage.getSignUpButtonText(), "Sign Up");
    }

    @Test(description = "Find close button text of the form", priority = 6)
    public void findCloseButtonext()
    {
        Assert.assertEquals(this.signUpPage.getCloseButtonText(), "close");
    }
}
