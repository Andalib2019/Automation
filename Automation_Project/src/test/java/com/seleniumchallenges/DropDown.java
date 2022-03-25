package com.seleniumchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class DropDown extends BaseClass {
   
    //How to handle the dropDown
    @Test
    public static void dropDownMenu() {
        
        driver.get("https://demoqa.com/select-menu");
        
        //create a reference variable for the web element
        WebElement dropdownmenu = driver.findElement(By.id("oldSelectMenu"));
        
        //you have to use the Select class and create the dropdown object
        //and pass the reference variable or locator
        Select dropdown = new Select(dropdownmenu);
        
        
        //Then I can selec t the dropdown option  using either select by index or select by visible text
        //or select by value
        dropdown.selectByIndex(1);
        
        //Another option
        
        //dropdown.selectByVisibleText("Blue");
        
    }

}
