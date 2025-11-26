package com.metlife.collections;

import java.util.ArrayList;
//Non-generic collection - not recommended
public class Demo0ArrayList {
    public static void main(String[] args) {
    int a1=10;
    double b1=20;

        ArrayList list=new ArrayList();

        list.add(10);//boxing - converting to object
        list.add("Hello");
        list.add(15.55);
        list.add(true);

        String a=(String) list.get(1); //unboxing --> converting back to specific type
        System.out.println(a.toUpperCase());

        double b=(double) list.get(2);
        System.out.println(b);

        int c= (int) list.get(0); //unboxing
        System.out.println(c+c);


        Object z=10; //boxing
        int z1= (int) z; //unboxing
        System.out.println(z1+z1);
    }
}
