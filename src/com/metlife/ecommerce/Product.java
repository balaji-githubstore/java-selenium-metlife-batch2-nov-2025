package com.metlife.ecommerce;

import org.openqa.selenium.chrome.ChromeDriver;

public class Product {
    public int id;
    public String name;
    public String description;
    public double price;
    public static String applicationName;

    public Product(int id)
    {
        this.id=id;
    }

    public Product(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public Product(String name,int id)
    {
        this.id=id;
        this.name=name;
    }

    public Product(double x)
    {

    }

    public void displayProduct()
    {
        System.out.println(this.id);
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println(Product.applicationName);
        System.out.println("------------------");
    }
}
