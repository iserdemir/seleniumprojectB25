package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations  {
    public static void main(String[] args) throws InterruptedException {


        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        //3- Go to tesla.com
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //this line will maximize browser size
        driver.manage().window().maximize();

        //use navigate().to()
        driver.navigate().to("https://www.galatasaray.org");

        //get the title of the page
     //   System.out.println("driver title = " + driver.getTitle());

        //get the utl of the page
     //   System.out.println("driver url = " + driver.getCurrentUrl());

        // this will close the currently opened window
        driver.close();

        //this will close all opened windows
        driver.quit();


    }
}