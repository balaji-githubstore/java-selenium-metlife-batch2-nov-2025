package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo17Upload {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://smallpdf.com/pdf-to-word");

        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Balaji\\Company\\MetLife Nov 2025 Batch 2\\Automation Testing.pdf");

    }
}
