package ru.praktikum.selenium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class OrderFirstPage {
    WebDriver webDriver;

    public OrderFirstPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    // Поле с именем.
    private By fieldName = By.xpath(".//input[@placeholder = '* Имя']");
    // Поле с фамилией.
    private By fieldSurname = By.xpath(".//input[@placeholder = '* Фамилия']");
    // Поле с адресом.
    private By fieldAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    // Стрелка выпадающего списка станций метро.
    private By dropdownArrowMetro = By.className("select-search__value");
    // Значение списка станций метро - "Ленинский проспект".
    private By listMetro = By.xpath(".//div[@class='Order_Text__2broi' and text()='Ленинский проспект']");
    // Поле с номером телефона.
    private By fieldPhone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    // Кнопка "Далее".
    private By orderButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    public void typeFieldName(String name) {
        webDriver.findElement(fieldName).sendKeys(name);
    }
    public void typeFieldSurname(String surname) {
        webDriver.findElement(fieldSurname).sendKeys(surname);
    }
    public void typeFieldAddress(String address) {
        webDriver.findElement(fieldAddress).sendKeys(address);
    }
    public void clickDropdownArrowMetro(){
    webDriver.findElement(dropdownArrowMetro).click();
    }
    public void pickListMetro(){
        webDriver.findElement(listMetro).click();
    }
    public void typeFieldPhone(String phoneNumber){
        webDriver.findElement(fieldPhone).sendKeys(phoneNumber);
    }
    public void clickOrderButtonNext(){
        webDriver.findElement(orderButtonNext).click();
    }
}
