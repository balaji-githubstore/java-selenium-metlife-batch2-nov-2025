package com.metlife.seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class Demo11SalesforceAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Wick");
        driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        Select DropdownOption = new Select(driver.findElement(By.name("CompanyEmployees")));
        DropdownOption.selectByVisibleText("201 - 10,000 employees");
        driver.findElement(By.name("CompanyName")).sendKeys("MetLife");
        Select DropdownOption1 = new Select(driver.findElement(By.name("CompanyCountry")));
        DropdownOption1.selectByVisibleText("United Kingdom");
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        driver.findElement(By.name("UserEmail")).sendKeys("john@gmail,com");

        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();


        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();

       String actualHeader= driver.findElement(By.xpath("//span[contains(text(),'No credit card')]")).getText();
        System.out.println(actualHeader);

       String actualError= driver.findElement(By.xpath("//span[contains(text(),'valid phone')]")).getText();
        System.out.println(actualError);


        String actualHeader2= driver.findElement(By.xpath("//span[contains(text(),'Answer 2')]")).getText();
        System.out.println(actualHeader2);
    }
}
