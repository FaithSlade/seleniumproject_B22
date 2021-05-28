package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_2_Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("faithslade@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("abc12345" + Keys.ENTER);
        Thread.sleep(5000);

        String expectingResult = "Log into Facebook";
        Thread.sleep(5000);
        String actualResult = driver.getTitle();

        if(actualResult.equals(expectingResult)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
