package com.demoblaze;

import org.openqa.selenium.By;

public class POM extends Driver{

    public Button signUp = new Button(webDriver, By.id("signin2"));
    public TextBox userName = new TextBox(webDriver, By.id("sign-username"));
    public TextBox password = new TextBox(webDriver, By.id("sign-password"));
    public Button signUpButton = new Button(webDriver, By.xpath("//*[@class=\"btn btn-primary\"]"));
}
