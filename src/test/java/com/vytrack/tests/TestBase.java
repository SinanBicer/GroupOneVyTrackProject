package com.vytrack.tests;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Sleep;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;
    public JavascriptExecutor jse;

    @BeforeMethod
    public void setUp() {
        driver= Driver.get();
        driver.get(ConfigurationReader.get("url"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);
        jse = (JavascriptExecutor) driver;


    }

    @AfterMethod
    public void tearDown() {
        Sleep.waitSecond(2);
        Driver.closeDriver();
    }

}