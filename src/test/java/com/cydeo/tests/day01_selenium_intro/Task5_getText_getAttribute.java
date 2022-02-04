package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_getText_getAttribute {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/registration_form");
        WebElement header = driver.findElement(By.className("page-header"));
        String head = header.getText();
        String expect = "Registration form";
        if (head.equals(expect)){
            System.out.println("Verification Passed!");
        }else {
            System.out.println("Verification Denied!");
        }
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Galatasaray");
      Thread.sleep(3000);
        String expected = "first name";
        String actual =name.getAttribute("placeholder");
        if (expected.equals(actual)){
            System.out.println("Verification Passed!");
        }else {
            System.out.println("Verification Denied!");
        }


        driver.close();
    }
}
