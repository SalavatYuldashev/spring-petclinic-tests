package com.salavat.petclinic.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeClass
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide()
                .screenshots(true) // Включаем скриншоты при падении тестов
                .savePageSource(false) // Отключаем сохранение исходного кода страницы (можно включить при необходимости)
        );
    }

    @BeforeMethod
    public void setUp() {
        // Configuration.browser = "firefox"; // Пример: если хотим использовать Firefox
        // Configuration.browserSize = "1920x1080";
        // Configuration.headless = true; // Пример: для запуска тестов в headless режиме
        Configuration.baseUrl = "http://localhost:8080"; // Укажите URL вашего приложения Petclinic
        // Configuration.reportsFolder = "target/selenide-reports"; // Папка для отчетов Selenide (если нужно)
        // Открываем главную страницу перед каждым тестом
        // Selenide.open("/"); // Это лучше делать в конкретных тестах или PageObject-ах
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver(); // Закрываем браузер после каждого теста
    }

    // Вспомогательные методы можно добавлять сюда
    public void open(String relativeUrl) {
        Selenide.open(relativeUrl);
    }
} 