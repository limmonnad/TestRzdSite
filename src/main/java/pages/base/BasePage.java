package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.Timeouts.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;
    public WebElement webElement;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Переход по url
     */
    public void goToUrl(String url) {
        driver.get(url);
    }


    /**
     * Ожидание элемента
     */
    public WebElement waitElement(By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * Кликнуть элемент
     */
    public WebElement clickToElement(By by) {
        webElement = driver.findElement(by);
        webElement.click();
        return webElement;
    }

    /**
     * Ввод данных в поле
     */
    public void enterInTheField(By field, String text) {
        webElement = clickToElement(field);
        webElement.sendKeys(text);
    }

}
