package com.dikondwarshivani.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_XPath
{
    @Test
    @Description("Please login and verify the URL")
    public void testSeleniumxpath() throws Exception
    {
        EdgeOptions edgeoption = new EdgeOptions();
        edgeoption.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeoption);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement click_make_appointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        click_make_appointment.click();

        Thread.sleep(3000);

        WebElement  username= driver.findElement(By.xpath("//input[@id='txt-username']"));
        username.sendKeys("John Doe");

        WebElement  password= driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_button.click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");









    }

}
