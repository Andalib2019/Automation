package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "Feature/",
        glue = {"com.stepdefinition","com.hooks"},
        //features and glue key word . @CucumberOptions is annotation
        //other option is not mandatory which is below but give you more features
        //that means it is optional
        //type of reporting and location of report file 
        //one type of report is json we can get the report in the target folder
        plugin= {"json:target/cucumber.json"}, 
        monochrome=true,
        //default option is false ,it will open browser but if it is true
        //it will not open browser we will see the result in console and can add more step 
        // in feature file  and for dryRun true we can  do by looking at the console 
        dryRun=false,
        //for tags for multiple scenario testing we can write tags="@smoke or @regression or ..."
        tags ="@smoke"
        //for strict= true , if the step missing it will fail so step will be included in the step definition.
        //strict=true
        
        )

public class MyRunner extends AbstractTestNGCucumberTests {

}
