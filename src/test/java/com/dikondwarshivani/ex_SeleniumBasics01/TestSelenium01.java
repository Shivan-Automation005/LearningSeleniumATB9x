package com.dikondwarshivani.ex_SeleniumBasics01;
import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestSelenium01
{
    @Test
    @Description("Open the App.vwo.com and get the title")
    public void test_Selenium01()
    {
        //FirefoxDriver driver = new FirefoxDriver();
        EdgeDriver edgedriver = new EdgeDriver();
        edgedriver.get("https://app.vwo.com/#/login");
        System.out.println(edgedriver.getTitle());
        //driver.get("https://app.vwo.com/#/login");
        //System.out.println(driver.getTitle());

    }

}
