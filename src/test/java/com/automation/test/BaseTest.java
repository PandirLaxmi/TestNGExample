package com.automation.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        //to run on saucelabs
        /*ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-TUL80");
        sauceOptions.put("name", "automated tests");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-ranalaxmi310-651d8:faa0056b-347f-4ff4-874d-640d3649caf4@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
         driver = new RemoteWebDriver(url, browserOptions);*/
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        //System.out.println("Before each");
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
        //System.out.println("Clean Up each");
    }
}
