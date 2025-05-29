package com.salavat.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;
// import static com.codeborne.selenide.Selenide.page; // Если будем использовать Selenide Page Factory

public class HomePage {

    // ==== Locators ====
    private final SelenideElement welcomeImage = $("img[src='resources/images/pets.png']");
    private final SelenideElement findOwnersLink = $(byXpath("//a[normalize-space()='FIND OWNERS']"));
    private final SelenideElement veterinariansLink = $(byXpath("//a[normalize-space()='VETERINARIANS']"));
    // private final SelenideElement errorLink = $(byXpath("//a[normalize-space()='ERROR']")); // Если понадобится

    // ==== Actions ====

    @Step("Нажать на ссылку 'Find owners'")
    public FindOwnersPage clickFindOwners() {
        findOwnersLink.click();
        // return page(FindOwnersPage.class); // Если используем Selenide Page Factory
        return new FindOwnersPage(); // Пока что так
    }

    @Step("Нажать на ссылку 'Veterinarians'")
    public VeterinariansPage clickVeterinarians() {
        veterinariansLink.click();
        // return page(VeterinariansPage.class);
        return new VeterinariansPage(); // Пока что так
    }

    @Step("Проверить, что изображение приветствия отображается")
    public boolean isWelcomeImageDisplayed() {
        return welcomeImage.isDisplayed();
    }

    // Можно добавить метод для клика по ссылке Error, если будем тестировать страницу ошибки с главной
    /*
    @Step("Нажать на ссылку 'Error' для проверки страницы ошибки")
    public void clickErrorLink() {
        errorLink.click();
    }
    */

    // Добавьте другие методы для взаимодействия с элементами главной страницы
} 