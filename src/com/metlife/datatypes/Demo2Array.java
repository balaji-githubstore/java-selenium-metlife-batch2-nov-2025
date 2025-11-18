package com.metlife.datatypes;

public class Demo2Array {

    public static void main(String[] args) {

        //10,20,30,40,50
        int[] numbers = new int[5];  //32*5 memory used
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
      //  numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(numbers);
        System.out.println(numbers[3]);

        //10.2, 40, 55.6
        double[] arr = new double[3];  //3*64 bits memory used
        arr[0] = 10.2;
        arr[1] = 40;
        arr[2] = 55.6;

        //red,green,yellow
        String[] colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";

        System.out.println(colors);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

        String[] arr2={"selenium","appium","playwright"};

        System.out.println(arr2[2]);
    }

}
