package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    protected WebDriver driver;

    // Csak a gomb "címét" (lokátorát) mentjük el az osztály tetején.
    private By signUpLoginButton = By.xpath("a[contains(text(), ' Signup / Login ']");

    // KONSTRUKTOR: Ezen keresztül adjuk át a futó böngészőt a tesztből.
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // METÓDUS: Ezzel a függvénnyel fogod elérni és lekattintani a gombot
    public void clickOnSignUpLogin() {
        driver.findElement(signUpLoginButton).click();
    }

}
