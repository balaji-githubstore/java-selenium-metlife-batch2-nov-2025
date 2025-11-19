package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo4Metlife {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.medibuddy.in/"); // wait for page load complete

        //check for presence of element in 0.5s
        driver.findElement(By.linkText("Login")).click();

        //check for presence of element in 0.5s
        driver.findElement(By.xpath("//div[text()='I have a Corporate Account']")).click();

        //      Click on Learn More
        //5.      Click on Skip
        //6.      Click on Login using Username & Password
        //7.      Enter username as john
        //8.      Enter password as john123
        //9.      Click on show password
        driver.findElement(By.xpath("//img[@alt='hide-password']")).click();
    }
}
