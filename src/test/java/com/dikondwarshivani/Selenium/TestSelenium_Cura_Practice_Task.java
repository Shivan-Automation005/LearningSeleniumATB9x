package com.dikondwarshivani.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Cura_Practice_Task
{
    @Test
    @Description("Please login and verify the URL")
    public void test_SeleniumCura() throws  Exception
    {

        EdgeOptions edgeoption = new EdgeOptions();
        edgeoption.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeoption);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement check_button = driver.findElement(By.id("btn-make-appointment"));
        check_button.click();

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement check_login = driver.findElement(By.id("btn-login"));
        check_login.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();






    }

}
