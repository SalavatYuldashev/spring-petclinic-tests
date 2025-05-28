package com.salavat.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
// import static com.codeborne.selenide.Selenide.page; // Если будем использовать Selenide Page Factory

public class HomePage {

    // ==== Locators ====
    // Примеры локаторов (нужно будет уточнить по реальной странице)
    private final SelenideElement findOwnersLink = $("a[href='/owners/find']"); // Пример
    private final SelenideElement veterinariansLink = $("//a[normalize-space()='Veterinarians']"); // Пример XPath
    private final SelenideElement welcomeImage = $("img[src*='pets.png']"); // Пример

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

    // Добавьте другие методы для взаимодействия с элементами главной страницы
} 