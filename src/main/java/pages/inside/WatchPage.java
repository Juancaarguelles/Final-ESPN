package pages.inside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class WatchPage extends BasePage
{

    @FindBy(css = ".BucketsContainer .Carousel--dark .Carousel__Wrapper .Carousel__Outer")
    private WebElement carousel;
    public WatchPage(WebDriver driver) {
        super(driver);
    }

    public String getCarouselRole()
    {
        return this.carousel.getAttribute("role");
    }

    public String getCardTitle()
    {
        return this.carousel.findElement(By.cssSelector(".Carousel__Inner > li:nth-child(2) .WatchTile__Title")).getText();
    }

    public String getCardDescription()
    {
        return this.carousel.findElement(By.cssSelector(".Carousel__Inner > li:nth-child(2) .WatchTile__Meta")).getText();
    }
}
