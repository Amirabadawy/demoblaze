package com.demoblaze;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverHandler {
    Driver driver = new Driver();
    POM pom = new POM();

    @BeforeTest
    public void setUp(){
        driver.navigate("https://www.demoblaze.com/index.html");
        driver.maximizeWindow();
    }

    @Test
    public void checkSignUp(){
        pom.signUp.clickOnButton();
        pom.userName.typeText("AmiraMustafa");
        pom.password.typeText("123456");
        pom.signUpButton.clickOnButton();
    }

}
