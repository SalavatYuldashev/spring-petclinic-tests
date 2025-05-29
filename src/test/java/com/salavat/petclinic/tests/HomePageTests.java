package com.salavat.petclinic.tests;

import com.salavat.petclinic.pages.HomePage;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Главная страница")
public class HomePageTests extends BaseTest {

    @Test(description = "Проверка успешной загрузки главной страницы и отображения ключевых элементов")
    @Story("Загрузка главной страницы")
    @Description("Тест проверяет, что главная страница открывается и на ней отображается приветственное изображение.")
    public void verifyHomePageLoadsSuccessfullyAndWelcomeImageIsDisplayed() {
        Selenide.open("/"); // Открываем базовый URL, который теперь "http://host.docker.internal:8080/"
        
        HomePage homePage = new HomePage();
        
        // Проверяем, что приветственное изображение отображается
        Assert.assertTrue(homePage.isWelcomeImageDisplayed(), "Приветственное изображение не отображается на главной странице.");
        
        // Можно добавить и другие проверки, например, что ссылки навигации присутствуют,
        // но для первого smoke-теста этого достаточно.
    }
} 