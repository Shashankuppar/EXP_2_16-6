package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebpageTest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://shashankuppar.github.io/EXP_2_16-6/");
    }

    @Test
    public void titleTest() {

        String actual = driver.getTitle();

        String expected = "Webpage Design";

        System.out.println("Actual Title: " + actual);

        Assert.assertEquals(actual, expected);
    }

    @AfterTest
    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }
}