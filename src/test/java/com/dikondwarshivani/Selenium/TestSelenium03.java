package com.dikondwarshivani.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestSelenium03
{
    public void test_Selenium03() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("CURA Healthcare Service is Visible");
            Assert.assertTrue(true);
        }
        else
        {
            throw new Exception("CURA Healthcare Service is not visible");
        }
    }

}
