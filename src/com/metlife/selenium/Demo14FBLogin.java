package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo14FBLogin {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/");

        driver.findElement(By.cssSelector("#email")).sendKeys("hello1232323@gmail.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("welcome232232");

        driver.findElement(By.cssSelector("button[name='login']")).click();
//        By loc=By.xpath("");
//        WebElement ele= driver.findElement(loc);
//        ele.click();




    }
}
