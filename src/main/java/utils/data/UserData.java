package utils.data;

import org.testng.annotations.DataProvider;

import java.util.Random;

public class UserData
{
    private static Random random;
    private static String FIRST_NAME;
    private static String LAST_NAME;
    private static String EMAIL;

    private static final String[]FIRST_NAMES;
    private static final String[]LAST_NAMES;
    private static final String PASSWORD;

    private static final int EMAIL_BOUND;
    private static final int FIRST_NAMES_BOUND;
    private static final int LAST_NAMES_BOUND;

    static {
        random = new Random();
        FIRST_NAME = LAST_NAME = EMAIL = "";

        PASSWORD = "12345qwerty";
        FIRST_NAMES = new String[]{"Juan", "Daniela", "Alena", "Dasha"};
        LAST_NAMES = new String[]{"Arguelles", "Fonseca", "Fox", "Jankowska"};
        EMAIL_BOUND = 9;
        FIRST_NAMES_BOUND = 4;
        LAST_NAMES_BOUND = 4;
    }

    @DataProvider(name = "user")
    public Object[][]inputData()
    {
        generateAccount();
        return new Object[][]{{FIRST_NAME, LAST_NAME, EMAIL, PASSWORD}};
    }

    private static void generateAccount()
    {
        generateFullName();
        generateEmail();
    }

    private static void generateFullName()
    {
        FIRST_NAME = FIRST_NAMES[random.nextInt(FIRST_NAMES_BOUND)];
        LAST_NAME = LAST_NAMES[random.nextInt(LAST_NAMES_BOUND)];
    }

    private static void generateEmail()
    {
        StringBuilder emailGenerator = new StringBuilder();

        for(int i = 0; i < EMAIL_BOUND; i++)
        emailGenerator.append((char)(random.nextInt(26)+'a'));

        emailGenerator.append("@yopmail.com");

        EMAIL = emailGenerator.toString();
    }
}
