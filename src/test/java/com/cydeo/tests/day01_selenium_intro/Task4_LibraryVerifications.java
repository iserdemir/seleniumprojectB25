package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("http://library2.cybertekschool.com/login.html");
        WebElement emailBox= dr.findElement(By.id("inputEmail"));
        emailBox.sendKeys("is.erdemir@gmail.com");
        WebElement pass = dr.findElement(By.id("inputPassword"));
        pass.sendKeys("12345" + Keys.ENTER);
        WebElement sign = dr.findElement(By.className("btn-btn-lg-btn-primary-btn-block"));
        sign.click();
    }
}
