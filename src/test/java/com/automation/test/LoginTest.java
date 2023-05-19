package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(groups = {"Laxmi", "Chirag"},priority = 1, dependsOnMethods = "verifyLoginUnsuccessful")
    public void verifyLoginSuccessful(){
        driver.get("https://www.google.com");
        //System.out.println("test  - verify login Successful");
}
    @Parameters("browser")
    @Test
    public void verifyLoginUnsuccessful(String browser){
        driver.get("https://www.google.com");
        System.out.println(browser);
        System.out.println("test  - verify login Unsuccessful");
        //Assert.fail();
    }
    @Test
    public void verifyLoginUnsuccessfulWithBlankCredential(){
        driver.get("https://www.google.com");
        System.out.println("test  - verify login Unsuccessful with blank credentials");
    }
}
