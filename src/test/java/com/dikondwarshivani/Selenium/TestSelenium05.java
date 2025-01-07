package com.dikondwarshivani.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium05
{
    @Test
    @Description("Verify the error message is seen in the vwo .com ")
    public void test_Selenium05()
    {


            EdgeOptions edgeoption = new EdgeOptions();
            edgeoption.addArguments("--start-maximized");


            WebDriver driver = new EdgeDriver(edgeoption);
            driver.get("https://app.vwo.com/#/login");
            //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">Start a free trial
        // </a>

        //Link Text Match

        //WebElement a_tag_free_trial = driver.findElement(By.linkText("Start a free trial"));
       // a_tag_free_trial.click();


        // Partial Text Match

        WebElement a_tag_free_trial_partial = driver.findElement(By.partialLinkText("free trial"));
        a_tag_free_trial_partial.click();

        //Start a free trial////
        //a free trial//
        //free trial//
        //trial





    }


}
