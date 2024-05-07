package ru.praktikum.selenium;

import org.junit.Test;
import ru.praktikum.selenium.pageObject.MainPage;

import java.util.Set;

public class ClickLogoRedirectToMainPageYandex extends Base {
    MainPage mainPage;

    String expectedURL = "https://dzen.ru/?yredirect=true";

    @Test
    public void clickLogoRedirectToMainPageScooter() {
        mainPage = new MainPage(webDriver);

        mainPage.clickLogoMainPageYandex();

        // Получение исходного идентификатора вкладки
        String originalWindow = webDriver.getWindowHandle();
        Set<String> windowHandles = webDriver.getWindowHandles();
        // Переключение на новую вкладку
        for (String window : windowHandles) {
            if (!window.equals(originalWindow)) {
                webDriver.switchTo().window(window);
                break;
            }
        }

                mainPage.checkUrlRedirectMainPageYandex(expectedURL);
    }
}
