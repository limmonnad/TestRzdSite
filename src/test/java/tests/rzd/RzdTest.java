package tests.rzd;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Url.RZD_URL;
import static pages.rzd.RzdFirstMainPage.*;
import static pages.rzd.RzdFourthSelectSeatPage.SELECT_SEAT;
import static pages.rzd.RzdFourthSelectSeatPage.SELECT_SEAT_CONTINUE_BUTTON;
import static pages.rzd.RzdSecondSelectTrainPage.SELECT_TRAIN;
import static pages.rzd.RzdThirdSelectTrainClassPage.CONTINUE_BUTTON_CLASS_TRAIN;


public class RzdTest extends BaseTest {


    @Test
    public void firstRzdTest() {
        basePage.goToUrl(RZD_URL);
        basePage.clickToElement(COOKIES_ACCEPT_BUTTON);

        basePage.enterInTheField(INPUT_FIELD_FROM_WHERE, FROM_WHERE);
        basePage.enterInTheField(INPUT_FIELD_WHERE_TO, WHERE_TO);

        basePage.clickToElement(INPUT_FIELD_DATE_THERE);
        basePage.clickToElement(SELECT_DATE);
        basePage.clickToElement(INPUT_FIELD_DATE_BACK);
        basePage.clickToElement(SELECT_DATE_BACK);
        basePage.clickToElement(FIND_BUTTON);

        basePage.waitElement(SELECT_TRAIN).click();

        basePage.waitElement(CONTINUE_BUTTON_CLASS_TRAIN).click();

        basePage.waitElement(SELECT_SEAT).click();
        basePage.clickToElement(SELECT_SEAT_CONTINUE_BUTTON);

    }
}
