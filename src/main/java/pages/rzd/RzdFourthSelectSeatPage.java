package pages.rzd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class RzdFourthSelectSeatPage extends BasePage {

    //первое свободное место
    public static final By SELECT_SEAT = By.xpath("(//*[contains(@class, 'available')])[1]");
    public static final By SELECT_SEAT_CONTINUE_BUTTON = By.xpath("//div[@class='selectseat__btn-wrap action-panel ng-star-inserted']//button [@class='button--terminal']");


    public RzdFourthSelectSeatPage(WebDriver driver) {
        super(driver);
    }

}
