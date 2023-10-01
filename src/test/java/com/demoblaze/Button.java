package com.demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button{
    private final By button;
    private final WebDriver driver;

    public Button(WebDriver driver,By button) {
        this.button = button;
        this.driver = driver;
    }

    public void clickOnButton(){
        driver.findElement(button).click();
    }
}
