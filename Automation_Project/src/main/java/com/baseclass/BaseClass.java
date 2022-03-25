package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
    
    public static WebDriver driver;
    
    @BeforeMethod
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver = new ChromeDriver(); // UpCasting polymorphism
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    
    //How do you open browser using seleniuum?
    //1.create the main method
    //2.System.setproperty(specify the driver , and location)
    //3.Create an object of the driver
    
    
   /* 
    public  void  setUp() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver =new ChromeDriver();//up casting polymorphism
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
    }*/
    
    
    
    //for the cross browser testing we need to do that the below code
    //parameters name has to be matched in cross browser xml
    @BeforeMethod(enabled=false)//for alert
    @Parameters("browser")
    public  void  setUp(String browser) {
        
        if(browser.equalsIgnoreCase("chrome")) {
            
        
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver =new ChromeDriver();//up casting polymorphism
        //driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        }else if(browser.equalsIgnoreCase("firefox")) {
            
            System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
            driver =new FirefoxDriver();//up casting polymorphism
            
            
        }else {
            System.out.println("The browser does not exist");
            
            
        }
        
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test(enabled=false)
    public void openApplication() {
        driver.get("https://www.facebook.com/");
        
    }
    
    
    
    
    /*
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver =new ChromeDriver();
       // driver.get("https://www.facebook.com/");
        //driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Happy Thanksgiving");
        
        //what is the difference between maximize and fullscreen?
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //cookies save user history.we have to delete the cookies.
        
        //deleting cookies will remove user history.
        driver.manage().deleteAllCookies();
        
        //what is the difference between driver.get and driver.naviget?
        //driver.naviget has more method but driver.get has one method.
       
        //driver.get("https://www.google.com/");
        
        //driver.get("https://www.zoopla.co.uk/");
        
        driver.get("https://www.zoopla.co.uk/signin/?page_after_login=%2F&return_url=%2F");
        //it shows the current url address in the console.
        System.out.println("The current url is:"+driver.getCurrentUrl());
        System.out.println("The title of the website is : "+driver.getTitle());
        
        driver.findElement(By.id("input-email-address")).sendKeys("anee_laila@yahoo.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        //driver.findElement(By.linkText("Forgot password"))
        driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();
        // driver.findElement(By.xpath("//button[@data-testid='signin-button']")).click();
        driver.findElement(By.xpath("(//*[text()='Sign in'])[2]")).click();
        
        
        
        
        
        //driver.navigate().to("https://www.google.com/");
        //driver.navigate().forward();
        //driver.navigate().back();
        //refresh reloads all the web elements
        //driver.navigate().refresh();
        
        
        //What are web elements?
        //web elements are stored in application which can be texts, search box, module,
        //images, etc.
        
        
        //What is a DOM page?
        //DOM stands for  Document Object Module which stores all the web elements.
        //Example html,javascript,css are storeed in the DOM page.
        
        
        //What is a locator?
        //A locator identifies the web element.  We have different types of web locators
        //Some example of locators are Xpath, CSS Selector, Name,ClassName, TagName, ID,
        //Linktext, PartialLinktext
        //It helps us interect with the web elements
        
        
    }
*/
}
