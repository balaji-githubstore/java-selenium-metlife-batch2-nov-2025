package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo18ShadowLatestSelenium {
    public static void main(String[] args) {

        //document.querySelector("page-builder-miaw-ui[deployment-dev-name='page_builder_miaw_ui']").shadowRoot.querySelector("button[data-testid='minimize-button']").click()
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.salesforce.com/in/");

//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("document.querySelector(\"page-builder-miaw-ui[deployment-dev-name='page_builder_miaw_ui']\")
//        .shadowRoot.querySelector(\"button[data-testid='minimize-button']\").click()");


        var shadow1= driver.findElement(By.cssSelector("page-builder-miaw-ui[deployment-dev-name='page_builder_miaw_ui']")).getShadowRoot();
        shadow1.findElement(By.cssSelector("button[data-testid='minimize-button']")).click();
    }
}
