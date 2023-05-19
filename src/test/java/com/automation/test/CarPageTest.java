package com.automation.test;

import org.testng.annotations.Test;

public class CarPageTest extends  BaseTest{
    @Test(groups = "Chirag",priority = 2 , dependsOnMethods = "verigyUserCanChangeQuantityOfItem")
    public void verifyUserCanAddItemIntoCart(){
        System.out.println("Test - Verify user can add item ito cart");
    }

    @Test (priority = 3)
    public void verigyUserCanChangeQuantityOfItem(){
        driver.get("https://www.ebay.com/");
        System.out.println("Test - Verify user can change quantity of items");
    }

    @Test (groups = "Chirag", priority = 1)
    public void verifyUserCanRemoveItemFromCart(){
        driver.get("https://www.ebay.com/");
        System.out.println("Test - verify user can remove item from the cart");
    }
}
