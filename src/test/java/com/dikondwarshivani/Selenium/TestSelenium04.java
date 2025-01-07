package com.dikondwarshivani.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium04
{
    @Test
    @Description("Verify the error message is seen in the vwo .com ")
    public void testSelenium04() throws Exception
    {
        EdgeOptions edgeoption = new EdgeOptions();
        edgeoption.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeoption);
        driver.get("https://app.vwo.com/#/login");

        // Find the email inputbox and enter the email

        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0">

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");



        //Find the password inputbox and enter the password

        //<input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // data-gtm-form-interact-field-id="1">


        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin123");



        // Find the submit button and click

        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica">


        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();

        Thread.sleep(3000);



        // Find the invalid message and verify

        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match
        // </div>

        WebElement messageerror = driver.findElement(By.className("notification-box-description"));

        Assert.assertEquals(messageerror.getText(),"Your email, password, IP address or location did not match");



        Thread.sleep(3000);
        driver.quit();  // It will close all the session --> session id == null
    }
}

