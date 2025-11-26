package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

//extension of array
//Generics - type safe collection
public class Demo2ArrayList {
    public static void main(String[] args) {

        List<String> numbers=new ArrayList<>();
        numbers.add("red");
        numbers.add("green");


        System.out.println(numbers.get(0).toUpperCase());
        System.out.println(numbers.size());

    }
}
