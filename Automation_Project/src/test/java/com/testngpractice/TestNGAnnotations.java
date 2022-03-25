package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am running before suite");
        
    }
    
    
 @BeforeTest   
 public void beforeTest() {
     System.out.println("I am running before Test");
     
        
    }
 
 @BeforeClass
 public void beforeClass() {
     System.out.println("I am running before class");
     
     
 }
 
 @BeforeMethod
 public void beforeMethod() {
     System.out.println("I am running before method");
     
     
 }
 
 
 @Test(priority=1)
 public void LogInTest() {
     System.out.println("I am running Login Test");
     
     
 }
 
 @Test(priority=3,dependsOnMethods = {"LogInTest"})
 public void CheckProfileTest() {
     System.out.println("I am running Check Profile Test");
     
     
 }
 
 @Test(priority=2, invocationCount = 10, enabled = false)
 public void SearchTest() {
     System.out.println("I am running Search Test");
     
     
 }
 
 @AfterMethod
 public void afterMethod() {
     System.out.println("I am running after methed");
     
     
 }
 @AfterClass
 public void afterClass() {
     System.out.println("I am running after class");
     
     
     
 }
 @AfterTest
 public void afterTest() {
     System.out.println("I am running after test");
     
     
     
 }
 @AfterSuite
 public void afterSuite() {
     System.out.println("I am running after suite");
     
     
     
 }
 


}
