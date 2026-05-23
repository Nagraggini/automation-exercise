package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    protected WebDriver driver;
    // a href Signup / Login
    public WebElement signUpPerLogin = driver.findElement(By.xpath("a[contains(text(), ' Signup / Login ']"));

}
