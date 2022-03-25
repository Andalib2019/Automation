package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.google.common.io.Files;

public class Commonutility extends BaseClass {
    
    public static WebElement getExplicitwait(WebElement elem, long time) {
        WebDriverWait wait= new WebDriverWait(driver,time);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elem));
        return element;
    }
    
    public static void takesScreenShot() throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//Type casting polymorphism
        File targetFile = new File(System.getProperty("user.dir")+"//screenshot/screenshot.png");
        targetFile.getParentFile().mkdir();
        srcFile.createNewFile();
        Files.copy(srcFile,targetFile);
        
    }
    
    public static void getHighLighter(WebElement element) {
        
        JavascriptExecutor executor=(JavascriptExecutor)driver;//type casting
        executor.executeScript("arguments[0].setAttribute('style','background: green; border: 4px solid black;')", element);
        
    }
    
    public static void actionsClick(WebElement element) {
        
        Actions action = new Actions(driver);
        action.click(element).build().perform();
    }
    
    
public static void getJsClick(WebElement element) {
    
    //Js means java script    
        JavascriptExecutor executor=(JavascriptExecutor)driver;//type casting
        executor.executeScript("arguments[0].click()", element);
        
    }

//The loop is used to handle new dropdown methods wich do not contain 
//the select tag
public static void handleDropDownMenu(WebDriver driver, String dropDownvalues) {
    
    //Store the WebElement in a list using the findelements
    List<WebElement> list = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
    
    //Then i have to use the advance for loop
    for(WebElement option: list) {
        
        //Use the drodown values from the for loop and pass the values
        if(option.getText().contains(dropDownvalues)) {
            option.click();
            break;
        }
    }
}
    
    

}
