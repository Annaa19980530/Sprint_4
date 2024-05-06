package ru.praktikum.selenium;

import org.junit.Test;
import ru.praktikum.selenium.page_object.MainPage;

public class CheckTextFaqListTest extends Base {

    MainPage mainPage;

    String textAnswerCoast = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    String textAnswerFewScooters = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    String textAnswerTimeRent = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    String textAnswerRentToday = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    String textAnswerExtendAndReturn = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    String textAnswerAboutCharger = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    String textAnswerDenyOrder = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    String textAnswerDeliveryFurtherMKAD = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test
    public void checkTextCoast() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionCoast();
        mainPage.checkTextAnswerCoast(textAnswerCoast);
    }
    @Test
    public void checkTextFewScooters() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionFewScooters();
        mainPage.checkTextAnswerFewScooters(textAnswerFewScooters);
    }
    @Test
    public void checkTextAnswerTimeRent() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionTimeRent();
        mainPage.checkTextAnswerTimeRent(textAnswerTimeRent);
    }
    @Test
    public void checkTextAnswerRentToday() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionRentToday();
        mainPage.checkTextAnswerRentToday(textAnswerRentToday);
    }
    @Test
    public void checkTextAnswerExtendAndReturn() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionExtendAndReturn();
        mainPage.checkTextAnswerExtendAndReturn(textAnswerExtendAndReturn);
    }
    @Test
    public void checkTextAnswerAboutCharger() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionAboutCharger();
        mainPage.checkTextAnswerAboutCharger(textAnswerAboutCharger);
    }
    @Test
    public void checkTextAnswerDenyOrder() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionDenyOrder();
        mainPage.checkTextAnswerDenyOrder(textAnswerDenyOrder);
    }
    @Test
    public void checkTextAnswerDeliveryFurtherMKAD() {
        mainPage = new MainPage(webDriver);

        mainPage.scrollBlockFaq();
        mainPage.clickTextQuestionDeliveryFurtherMKAD();
        mainPage.checkTextAnswerDeliveryFurtherMKAD(textAnswerDeliveryFurtherMKAD);
    }
}
