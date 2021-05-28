package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-setup the browser driver
        //if you command it out it will not work
        WebDriverManager.chromedriver().setup();
        //System.setProperty("Chrome","part of where you saved the driver");

        //2- create instance of selenium web driver ==> create object
        //this is the line that opens the browser
        WebDriver driver = new ChromeDriver();

        //this line will basically maximize the browser size
        //it will work on both open page
        driver.manage().window().maximize();

        //will work for mac only, will not work in windows.
        driver.manage().window().fullscreen();

        //3-get the page for tesla.com ==> calling method
        driver.get("https://www.tesla.com");//you can take www. out but not suggestion to do so

        System.out.println("Current title: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        //putting 3 second of wait/ stop the code for 3 sec
        Thread.sleep(3000);

        //4-Going back using navigations
        driver.navigate().back();

        //putting 3 second of wait/ stop the code for 3 sec
        Thread.sleep(3000);

        //5-Going forward using navigations
        driver.navigate().forward();

        //putting 3 second of wait/ stop the code for 3 sec
        Thread.sleep(3000);

        //6-refreshing the page using navigations
        driver.navigate().refresh();

        //7-going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab
        driver.close();

        //driver.quit();

    }

}
