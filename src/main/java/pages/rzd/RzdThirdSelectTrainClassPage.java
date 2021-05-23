package pages.rzd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class RzdThirdSelectTrainClassPage extends BasePage {

    public static final By CONTINUE_BUTTON_CLASS_TRAIN = By.xpath("//div [@class='railway-service-class-selection-footer__panel--sticky railway-service-class-selection-footer__panel d-block']//button[@class='button--terminal']");

    public RzdThirdSelectTrainClassPage(WebDriver driver) {
        super(driver);
    }


}
