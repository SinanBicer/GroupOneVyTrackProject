package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Sleep;
import com.vytrack.utilities.odometer_page.Odo_Cre_Page;
import com.vytrack.utilities.odometer_page.Odometer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VyTrak_Vehicle_Odometer extends TestBase{

    @Test
    public void test1() {
        driver.findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.get("driver_username")+ Keys.TAB+ConfigurationReader.get("driver_password")+ Keys.ENTER);
        actions = new Actions(driver);

        WebElement fleet = driver.findElement(By.xpath("//a[@class]/span"));
        wait.until(ExpectedConditions.visibilityOf(fleet));
        actions.moveToElement(fleet).perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[.='Vehicle Odometer']")))).click();
        Sleep.waitSecond(2);
        wait.until(ExpectedConditions.elementToBeClickable(Odometer.CreateButton)).click();
        Odo_Cre_Page.OdoValue.sendKeys("1000");
        Odo_Cre_Page.Date.click();

        Sleep.waitSecond(5);




        //test

    }
}
