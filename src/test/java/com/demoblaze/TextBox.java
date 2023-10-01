package com.demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {
    private final By textBox;
    private final WebDriver driver;

    public TextBox(WebDriver webDriver, By textBox) {
        this.textBox = textBox;
        this.driver = webDriver;
    }

    public void typeText(String text){
       driver.findElement(textBox).sendKeys(text);
    }
}
