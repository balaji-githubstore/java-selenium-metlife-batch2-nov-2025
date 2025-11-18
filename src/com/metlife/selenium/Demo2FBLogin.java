package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("hello1232323@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("welcome232232");

        driver.findElement(By.name("login")).click();


    }
}
