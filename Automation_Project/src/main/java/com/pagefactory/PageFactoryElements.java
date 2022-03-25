package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PageFactoryElements extends BaseClass {
    //page factory is a repository used to store all our elements of locator
    //page factory uses the encapsulation concepts from java
    //Encapsulation uses private variable getter and setter method , finish within class
    
    //create a constructor
    //A constructor is a special type of method that has the same class name
    //A constructor invokes implicitly
    
    public PageFactoryElements() {
        PageFactory.initElements(driver, this);
        
        
        
    }
    //we have to use pagefactory annotation to store the elements
    
    
    //@FindBy(xpath="(//*[@class='css-mx98y1-Text eczcs4p0'])[9]")
    @FindBy(xpath="(//*[text()='Sign in'])[2]")
    @CacheLookup
    private WebElement login;

    public WebElement getLogin() {
        return login;
    }
    @FindBy(id="input-email-address")
    @CacheLookup
    private WebElement email;

    public WebElement getEmail() {
        return email;
    }
    @FindBy(id="input-password")
    @CacheLookup
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }
    @FindBy(xpath="//*[@data-testid='signin-button']")
    @CacheLookup
    private WebElement signIn;

    public WebElement getSignIn() {
        return signIn;
    }
    
    /* @FindBy(css="#input-email-address")
     * @CacheLookup
     * private WebElement cssEmail;
     * public WebElement getCssEmail(){
     * return cssemail;
     * }
     */
    /* @FindB(css=".css....")
     * CacheLookup
     */
    
    
    

}
