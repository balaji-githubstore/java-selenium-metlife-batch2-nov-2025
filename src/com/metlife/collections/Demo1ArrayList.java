package com.metlife.collections;

import java.util.ArrayList;

//extension of array
public class Demo1ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(103);


        System.out.println(numbers.get(0));
        System.out.println(numbers.size());

    }
}
