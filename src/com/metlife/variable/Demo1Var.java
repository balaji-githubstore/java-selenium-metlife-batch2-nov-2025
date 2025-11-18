package com.metlife.variable;

public class Demo1Var {
    public static int aS=10;
    public static int bS=20;

    public int aNS=10;
    public int bNS=20;

    public static void printStaticVariable()
    {
        //cannot access not-static member directly
        System.out.println(Demo1Var.aS);
        System.out.println(Demo1Var.bS);
    }

    public void printAllVariable()
    {
        System.out.println(Demo1Var.aS);
        System.out.println(Demo1Var.bS);
        System.out.println(aNS);
        System.out.println(bNS);
    }

    public static void main(String[] args) {
        int a=10; //local variable
        Demo1Var.aS=2000;
        Demo1Var obj1=new Demo1Var();
        Demo1Var obj2=new Demo1Var();

        obj1.aNS=3000;
        Demo1Var.printStaticVariable();
        obj2.printAllVariable();

        obj1.printAllVariable();

    }
}

