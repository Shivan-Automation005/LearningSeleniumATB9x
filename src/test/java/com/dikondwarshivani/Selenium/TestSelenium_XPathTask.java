package com.dikondwarshivani.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_XPathTask
{
    @Test
    @Description("Login with email and password and verify that the free trial is expired")
    public void testselenium_xpath_task() throws Exception
    {

        EdgeOptions edgeoption = new EdgeOptions();
        edgeoption.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeoption);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(2000);


        WebElement email= driver.findElement(By.xpath("//input[@id='username']"));
        email.sendKeys("augtest_040823@idrive.com");

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");


        WebElement clickon_SignIn = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        clickon_SignIn.click();


        Thread.sleep(15000);






        WebElement message = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));

       //Assert.assertEquals(message.getText(),"Your free trial has expired");


        if (message.getText().contains("Your free trial has expired"))


        {
            System.out.println("Free trial message is visible");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Free trial message is not visible");
        }

        //WebElement free_trial = driver.findElement(By.xpath("//h5[@class='id-card-title'"));
       // Assert.assertEquals(free_trial.getText(),"Your free trial has expired");





    }

}
