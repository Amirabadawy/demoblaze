package com.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    static WebDriver webDriver;

    public Driver() {
        setUpDriver();
    }

    public void setUpDriver(){
        ChromeOptions chromeCapabilities = new ChromeOptions();
        webDriver = new ChromeDriver(chromeCapabilities);
    }

    public void navigate(String link){
        webDriver.navigate().to(link);
    }

    public void maximizeWindow(){
        webDriver.manage().window().maximize();
    }

    public void tearDown(){
        webDriver.quit();
    }


}
