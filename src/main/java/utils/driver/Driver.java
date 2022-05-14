package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver
{
    private WebDriver driver;

    public Driver(String browser)
    {
        switch (browser)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                this.driver = new ChromeDriver();
                break;
            case "firefox":
                //TODO
                break;
        }
    }

    public WebDriver getDriver()
    {
        return this.driver;
    }
}
