package com.metlife.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo3HashMap {
    public static void main(String[] args) {

        Map<Integer,String> employees=new HashMap<>();
        employees.put(101,"mary1");
        employees.put(102,"mary2");
        employees.put(103,"mary3");
        employees.put(102,"peter");

        System.out.println(employees);
        System.out.println(employees.size());

        if(employees.containsKey(105))
        {
            System.out.println(employees.get(105));
        }

        employees.remove(103);
        System.out.println(employees);

    }
}
