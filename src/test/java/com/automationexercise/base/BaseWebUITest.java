package com.automationexercise.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/** Közös UI függvények (openPage, handleCookies) */
public class BaseWebUITest extends BaseTest {

    /** Csak azt, hogy a böngésző szerint az oldal betöltődött. */
    public void waitForPageLoad() {
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete'"));

        // Modern Selenium Best Practice, ha egy konkrét gombra állítasz be wait-t,
        // mindegyik egységtesztnél.
    }

    /** Sütik elfogadása. */
    public void handleCookies() {

        try {
            // Süti elfogadása gombra kattintás max 10 másodperces várakozással.
            wait.until(ExpectedConditions
                    .elementToBeClickable(
                            By.xpath("//button[contains(text(), 'Belegyezés') or contains(text(), 'Consent')]")))
                    .click();

        } catch (Exception e) {
            // Ha véletlenül nem ugrana fel, ne hasaljon el a teszt.
            System.out.println("--- !!! --- Süti sáv nem jelent meg.");
        }
    }

    public void openPage(String url) {
        // Várunk kicsit, hogy a driver is inicializálódjon.
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        driver.get(url);
        waitForPageLoad();
        handleCookies();
    }
}
