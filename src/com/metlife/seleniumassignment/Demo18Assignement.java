package com.metlife.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Demo18Assignement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://login.salesforce.com/?locale=in");


        Thread.sleep(5000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='marketing']")));

        driver.findElement(By.xpath("//a[normalize-space()='Download free ebook' or normalize-space()='Get the report' or normalize-space()='Download the playbook' or normalize-space()='Free Trial']")).click();

        //Switch to 2nd tab
        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.name("UserFirstName")).sendKeys("John");

//        Get the error message shown for lastname

    }
}
