package com.exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.baseclass.BaseClass;

public class SeleniumExceptions extends BaseClass {
    
    //Use the Fluent wait to handle the  stale element exception
    //you have to memorise this code
    
    
    public void staleElementExample() {
        
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                                   .withTimeout(30, TimeUnit.SECONDS)//Maximum time to wait
                                   .pollingEvery(5, TimeUnit.SECONDS)//checking if the element visible every 5 seconds
                                   .ignoring(NoSuchElementException.class);//ignores the Exception
        
        
    }

}
