package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FBSignUp {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        //firstname as john
        //lastname as john123
        //click on custom radio button
    }
}
