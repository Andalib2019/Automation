package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.baseclass.BaseClass;
import com.pagefactory.PageFactoryElements;
import com.utilities.Commonutility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginFunction extends BaseClass{
    PageFactoryElements pf;
    
    @Given("User can open any browser")
    public void user_can_open_any_browser() {
        //System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
       // WebDriver driver =new ChromeDriver();
        
        //setUp();
        pf = PageFactory.initElements(driver, PageFactoryElements.class);
        
        
        
    }

    @Given("User is able to enter {string} url")
    public void user_is_able_to_enter_url(String url) {
        //driver.get("https://www.zoopla.co.uk/");
        driver.get(url);
        
        
    }

    @When("User clicks on the Login in button")
    public void user_clicks_on_the_login_in_button() throws IOException {
       // driver.findElement(By.xpath("(//*[@class='css-mx98y1-Text eczcs4p0'])[9]")).click();
       //driver.findElement(By.xpath("(//*[@class='css-mx98y1-Text eczcs4p0'])[9]")) .click();
        //driver.findElement(By.xpath("")) .click();
        //driver.findElement(pf.getLogin()).click();
        
        //polymorphism method overloading or static binding or compile time polymorphism
        Commonutility.getExplicitwait(pf.getLogin(), 15);//this is how we use explicit wait
        
        Commonutility.takesScreenShot();
        pf.getLogin().click();
        
        
        
    }

    @When("User enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) throws InterruptedException, IOException {
       // driver.findElement(By.id("")).sendKeys(email);
        //driver.findElement(By.id("")).sendKeys(password);
        Commonutility.getExplicitwait(pf.getEmail(), 12);
        Commonutility.getHighLighter(pf.getEmail());
        pf.getEmail().sendKeys(email);
        //unconditional wait is thred.sleep we are not using this often
        Thread.sleep(5000);
        pf.getPassword().sendKeys(password);
        
        //pf.getPassword().submit();//submit method means hitting the enter key
        Commonutility.takesScreenShot();
        
    }

    @When("User clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        
        pf.getPassword().submit();//it will click the enter/return key
        
        //driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();
       // driver.findElement(By.xpath("")).click();
        
        
        Commonutility.getJsClick(pf.getSignIn());
        
        //if this action click does not work then use commonutility getJsClick
        //Commonutility.actionsClick(pf.getSignIn());
       //pf.getSignIn().click(); 
        //if this method  getSignIn does not work
        //then we use commonutility action click method
        
        
        
    }

    @Then("User is able to verify successful login and verify page title")
    public void user_is_able_to_verify_successful_login_and_verify_page_title() {
        System.out.println("The title of the website is : "+driver.getTitle());
        
        String expected = "Sign in to Zoopla - Zoopla";
        Assert.assertEquals(expected, driver.getTitle());
        
        
        //driver.quit();
        
        
    }

}
