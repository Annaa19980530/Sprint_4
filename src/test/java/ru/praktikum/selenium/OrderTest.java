package ru.praktikum.selenium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.selenium.pageObject.MainPage;
import ru.praktikum.selenium.pageObject.OrderFirstPage;
import ru.praktikum.selenium.pageObject.OrderSecondPage;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderTest extends Base {

    MainPage mainPage;
    OrderFirstPage orderFirstPage;
    OrderSecondPage orderSecondPage;

    String name;
    String surname;
    String address;
    String phoneNumber;
    String calendarDate;
    String comments;

    public OrderTest(String name, String surname, String address, String phoneNumber, String calendarDate, String comments) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.calendarDate = calendarDate;
        this.comments = comments;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> getCredentials() {
        return Arrays.asList(new Object[][]{
                {"Олег", "Ушаков", "Ленинский 1", "89773316645", "01.06.2023", "Жду вас скорее!"},
                {"Яндекс", "Практикум", "Вернадского 5", "84955555555", "05.06.2023", ""},
        });
    }

    @Test
    public void orderByTopButton() {
        mainPage = new MainPage(webDriver);
        orderFirstPage = new OrderFirstPage(webDriver);
        orderSecondPage = new OrderSecondPage(webDriver);

        mainPage.clickOrderTopButton();

        orderFirstPage.typeFieldName(name);
        orderFirstPage.typeFieldSurname(surname);
        orderFirstPage.typeFieldAddress(address);
        orderFirstPage.clickDropdownArrowMetro();
        orderFirstPage.pickListMetro();
        orderFirstPage.typeFieldPhone(phoneNumber);
        orderFirstPage.clickOrderButtonNext();

        orderSecondPage.typeFieldCalendarDate(calendarDate);
        orderSecondPage.clickDropdownArrowRentalPeriod();
        orderSecondPage.pickRentalPeriodOneDay();
        orderSecondPage.pickScooterColourBlack();
        orderSecondPage.typeFieldComments(comments);
        orderSecondPage.clickOrderButtonNext();
        orderSecondPage.checkWindowQuestionNewOrder();
        orderSecondPage.clickOrderButtonFinal();
        orderSecondPage.checkWindowСonfirmationNewOrder();
    }
    @Test
    public void orderByBottomButton() {
        mainPage = new MainPage(webDriver);
        orderFirstPage = new OrderFirstPage(webDriver);
        orderSecondPage = new OrderSecondPage(webDriver);

        mainPage.scrollBlockOrder();
        mainPage.clickOrderBottomButton();

        orderFirstPage.typeFieldName(name);
        orderFirstPage.typeFieldSurname(surname);
        orderFirstPage.typeFieldAddress(address);
        orderFirstPage.clickDropdownArrowMetro();
        orderFirstPage.pickListMetro();
        orderFirstPage.typeFieldPhone(phoneNumber);
        orderFirstPage.clickOrderButtonNext();

        orderSecondPage.typeFieldCalendarDate(calendarDate);
        orderSecondPage.clickDropdownArrowRentalPeriod();
        orderSecondPage.pickRentalPeriodOneDay();
        orderSecondPage.pickScooterColourBlack();
        orderSecondPage.typeFieldComments(comments);
        orderSecondPage.clickOrderButtonNext();
        orderSecondPage.checkWindowQuestionNewOrder();
        orderSecondPage.clickOrderButtonFinal();
        orderSecondPage.checkWindowСonfirmationNewOrder();
    }
}
