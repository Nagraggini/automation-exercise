package com.automationexercise.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    protected WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    private By BannerCloseBtn = By.xpath("//div[@class='continue-prompt-text' and text()='Close']");

    // Csak a gomb "címét" (lokátorát) mentjük el az osztály tetején.
    private By signUpLoginBtn = By.xpath("//a[contains(text(),'Signup')]");

    // KONSTRUKTOR: Ezen keresztül adjuk át a futó böngészőt a tesztből.
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // METÓDUS: Ezzel a függvénnyel fogod elérni és lekattintani a gombot
    public void clickOnSignUpLogin() {
        driver.findElement(signUpLoginBtn).click();
    }

    public void clickBannerClose() {

        try {
            // Süti elfogadása gombra kattintás max 10 másodperces várakozással.
            wait.until(ExpectedConditions
                    .elementToBeClickable(driver.findElement(
                            BannerCloseBtn)))
                    .click();

        } catch (Exception e) {
            // Ha véletlenül nem ugrana fel, ne hasaljon el a teszt.
            System.out.println("--- !!! --- Banner nem jelent meg.");
        }
    }

}
