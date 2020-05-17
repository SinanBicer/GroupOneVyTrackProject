package com.vytrack.utilities.odometer_page;

import com.vytrack.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odo_Cre_Page {

    public static WebElement OdoValue= TestBase.driver.findElement(By.name("custom_entity_type[OdometerValue]"));
    public static WebElement Date= TestBase.driver.findElement(By.xpath("//div[2]/div[2]/input"));

}
