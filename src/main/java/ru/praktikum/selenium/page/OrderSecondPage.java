package ru.praktikum.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class OrderSecondPage {

    WebDriver webDriver;

    public OrderSecondPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    // Поле даты доставки.
    private By fieldCalendarDate = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    // Стрелка выпадающего списка продолжительности аренды.
    private By dropdownArrowRentalPeriod = By.xpath(".//span[@class='Dropdown-arrow']");
    // Значение списка продолжительности аренды - "Сутки".
    private By rentalPeriodOneDay = By.xpath(".//div[@role='option' and text()='сутки']");
    // Значение чек-бокса цвета самоката - "Черный".
    private By scooterColourBlack = By.id("black");
    // Поле комментария.
    private By fieldComments = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    // Кнопка "Заказать".
    private By orderButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    // Текст всплывающего уведомления - "Хотите оформить заказ?".
    private By windowQuestionNewOrder = By.xpath(".//div[text()='Хотите оформить заказ?']");
    // Кнопка "Да" во всплывающем уведомлении.
    private By orderButtonFinal = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // Текст всплывающего подтверждения - "Заказ оформлен".
    private By windowСonfirmationNewOrder = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public void typeFieldCalendarDate(String calendarDate){
        webDriver.findElement(fieldCalendarDate).sendKeys(calendarDate);
    }
    public void clickDropdownArrowRentalPeriod(){
        webDriver.findElement(dropdownArrowRentalPeriod).click();
    }
    public void pickRentalPeriodOneDay(){
        webDriver.findElement(rentalPeriodOneDay).click();
    }
    public void pickScooterColourBlack(){
        webDriver.findElement(scooterColourBlack).click();
    }
    public void typeFieldComments(String comments){
        webDriver.findElement(fieldComments).sendKeys(comments);
    }
    public void clickOrderButtonNext(){
        webDriver.findElement(orderButtonNext).click();
    }
    public void checkWindowQuestionNewOrder(){
        boolean isDisplayed = webDriver.findElement(windowQuestionNewOrder).isDisplayed();
        assertTrue(isDisplayed);
    }
    public void clickOrderButtonFinal(){
        webDriver.findElement(orderButtonFinal).click();
    }
    public void checkWindowСonfirmationNewOrder(){
        boolean isDisplayed = webDriver.findElement(windowСonfirmationNewOrder).isDisplayed();
        assertTrue(isDisplayed);
    }
}
