package com.metlife.datatypes;

public class Demo1DataTypes {

    public static void main(String[] args) {

        byte myValue=100; //myValue is registered for byte - 8 bits of memory used

        short b=100; //16 bits
        int c=0; //32 bits
        long d=88888999988L; //64 bits

        float e=1.2f; //32 bits
        double f=1.2; //64 bits

        double result=f+c;

        System.out.println(18.9);

        //whole number --> int
        //decimal --> double

        int radius=10;
        //area of circle and print it
        double output= 3.14*radius*radius;
        System.out.println(output);

        char letter='b'; //16 bits
        boolean check=true;  //1 bit

        String myName="Bala"; //4*16 bits
        System.out.println(myName);
        System.out.println(myName.length());

        System.out.println(myName.toUpperCase());

        System.out.println(myName.charAt(2));





    }
}
