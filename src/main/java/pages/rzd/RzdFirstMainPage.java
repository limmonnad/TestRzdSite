package pages.rzd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RzdFirstMainPage extends BasePage {

    public static final String FROM_WHERE = "Москва";
    public static final String WHERE_TO = "Санкт-Петербург";

    public static final By COOKIES_ACCEPT_BUTTON = By.xpath("//button[@class='cookie-alert__btn btn-primary']");
    public static final By INPUT_FIELD_FROM_WHERE = By.xpath("//input[@placeholder='Откуда']");
    public static final By INPUT_FIELD_WHERE_TO = By.xpath("//input[@placeholder='Куда']");
    public static final By INPUT_FIELD_DATE_THERE = By.xpath("//input[@placeholder='Туда']");

    public static final By SELECT_DATE = By.xpath("(//table[@class='rzd-datepicker-calendar']//td[@data-handler='selectDay'])[10]");
    public static final By INPUT_FIELD_DATE_BACK = By.xpath("//input[@placeholder='Обратно']");

    public static final By SELECT_DATE_BACK = By.xpath("(//table[@class='rzd-datepicker-calendar']//td[@data-handler='selectDay'])[11]");
    public static final By FIND_BUTTON = By.xpath("//a[@class = 'rzd-button bg-accessible rzd-go-to-result-button']");

    public RzdFirstMainPage(WebDriver driver) {
        super(driver);
    }

}

