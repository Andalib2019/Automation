package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
    WebDriver driver;
    
    
    @BeforeTest
    public void openBrowser() {
        
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver =new ChromeDriver();//up casting polymorphism
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        
    }
    
    @Test
    
    public void openApplication() {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("myeamil@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("mypass");
        driver.findElement(By.xpath("//*[@name='login']")).click();
    }
    
    
    @AfterTest
    public void closeApplication() {
        
        driver.quit();
        
    }
    
    
    

}
