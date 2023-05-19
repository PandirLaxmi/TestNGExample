package com.automation.test;

import org.testng.annotations.Test;

public class ProductDetailPageTest extends BaseTest{
    @Test
    public void verifyPriceOnDetailPage(){
        driver.get("https://www.facebook.com/");
        System.out.println("Test - Verify Price on Product " );
    }

    @Test (groups = "Chirag")
    public void verifyStockInformation(){
        driver.get("https://www.ebay.com/");
        System.out.println("Test - verify stock information");
    }
}
