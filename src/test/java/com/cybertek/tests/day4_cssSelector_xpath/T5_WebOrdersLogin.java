package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectingResult = "Web Orders Login";
        String actualResult = driver.getTitle();

        if(actualResult.equals(expectingResult)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

        WebElement inputUsername = driver.findElement(By.name("ctl00$MainContent$username"));
        inputUsername.sendKeys("Tester");

        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        WebElement loginButton = driver.findElement(By.name("ctl00$MainContent$login_button"));
        loginButton.sendKeys("Tester" + Keys.ENTER);

        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if (actualHomePageTitle.equals(expectedHomePageTitle)){
            System.out.println("Home page title verification PASSED!");
        }else{
            System.out.println("Home page title verification FAILED!!!");
        }
    }
}
