package com.metlife.ecommerce;

public class ProductRunner {
    public static void main(String[] args) {

        Product.applicationName="Amazon";

        //(101, watch, watch by titan, 3000)
        //(102,mobile,mobile by samsung,7000)
        Product p1=new Product();
        Product p2=new Product();

        p1.id=101;
        p1.name="watch";
        p1.description="by titan";
        p1.price=3000;

        p2.id=102;
        p2.name="mobile";
        p2.description="by mobile";
        p2.price=3000;

        p2.displayProduct();
        p1.displayProduct();


    }
}
