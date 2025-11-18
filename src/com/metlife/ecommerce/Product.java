package com.metlife.ecommerce;

public class Product {
    public int id;
    public String name;
    public String description;
    public double price;
    public static String applicationName;

    public void displayProduct()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(description);
        System.out.println(price);
        System.out.println(Product.applicationName);
        System.out.println("------------------");
    }

    public void get(String url)
    {
        System.out.println("Use id "+id);
        System.out.println(url);
        System.out.println("---------------");
    }

}
