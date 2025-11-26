package com.metlife.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo4HashMap {
    public static void main(String[] args) {

        Map<String,String> employees1=new HashMap<>();
        employees1.put("firstName","mary1");
        employees1.put("middleName","mary2");
        employees1.put("lastName","mary3");

        Map<String,String> employees2=new HashMap<>();
        employees2.put("firstName","mary1");
        employees2.put("middleName","mary2");
        employees2.put("lastName","mary3");


        List<Map<String,String>> list=new ArrayList<>();
        list.add(employees1);
        list.add(employees2);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(0).get("firstName"));
    }
}
