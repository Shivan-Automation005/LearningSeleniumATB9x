package com.dikondwarshivani.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class SeleniumWebtables
{
    @Test
    public void seleniumWebtables()
    {


  //xpath - //table[@id="customers"]/tbody/tr[
  // i
  // ]/td[
  // j
  // ]


        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";



        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for(int i=2;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
               String dynamic_path= first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();

               // System.out.println(data);

                if(data.contains("Helen Bennett")) {
                    String country_path = dynamic_path + "/following-sibling::td";

                    String country_text = driver.findElement(By.xpath(country_path)).getText();

                    System.out.println("Helen Bennett is in " + country_text);
                }
            }
        }


    }

}
