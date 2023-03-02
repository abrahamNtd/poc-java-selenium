package mx.abrahamNtd.poc.web;


import org.junit.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicTest {

    private WebDriver driver;

    @Test
    public void verifyGitHubTitle() {
        String driverPath = System.getProperty("user.dir") + "/src/test/resources/chromeDriver_110/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com.mx/");
        assertThat(driver.getTitle(), containsString("Google"));
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}