package com.seleniumchallenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utilities.Commonutility;



public class Alerts extends BaseClass {
    @Test
    public static void alertMessage() {
        
        
        driver.get("https://demoqa.com/alerts");    
        
        WebElement element = driver.findElement(By.id("confirmButton"));
        
        Commonutility.actionsClick(element);
        
        //Must know Alert is an interface. In order to create the object, you need to use the Alerts class
            
        Alert alert = driver.switchTo().alert();
       // Thread.sleep(3000);//handle with the exception
        alert.accept(); // or you can do arert.dismiss() 
        
        String expected = "You selected Ok";
        System.out.println(expected);
        String actual = driver.findElement(By.id("confirmResult")).getText();       
        System.out.println(actual); 
        Assert.assertEquals(actual, expected);
        
        
       /* 
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://demoqa.com/alerts");
        
        driver.findElement(By.id("confirmButton")).click();
        
       
        //Alert is an interface
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //alert.dismiss();
        
        String expected="You selected Ok";
        String actual = driver.findElement(By.id("confirmResult")).getText();
        
        System.out.println(actual);
        
        Assert.assertEquals(actual, expected);
        
        
        */
        
        
        
        
        
        
        
    }

}
