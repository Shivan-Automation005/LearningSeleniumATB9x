package com.dikondwarshivani.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium06
{
    @Test
    @Description("Verify the error message is seen in the vwo .com ")
    public void testSelenium06() throws  Exception
    {

        EdgeOptions edgeoption = new EdgeOptions();
        edgeoption.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeoption);
        driver.get("https://vwo.com/free-trial");


        //<input class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email" id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email" required="">

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("1235476zdgdthf24");

        //<input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)" type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-306cu-gdpr-consent-checkbox" value="true"
        // data-qa="page-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="0">

        WebElement check_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        check_policy.click();


        //List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        //buttonList.get(0);

        //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit" value="">Create a Free Trial Account</button>

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();


        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.</div>

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

    }

}
