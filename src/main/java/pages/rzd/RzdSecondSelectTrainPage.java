package pages.rzd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RzdSecondSelectTrainPage extends BasePage {


    //второй поезд
    public static final By SELECT_TRAIN = By.xpath("(//div[@class='row card__body ng-star-inserted'])[2]");


    public RzdSecondSelectTrainPage(WebDriver driver) {
        super(driver);
    }

}
