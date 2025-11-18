package com.metlife.methods;


import com.metlife.formula.Area;

public class Demo1Method {

    public static void main(String[] args) {

        int radius = 10;

        //allocate memory for all non-static member
        Area obj=new Area();

        double result = obj.areaOfCircle(10);
        System.out.println(result);

        result = obj.areaOfCircle(20);
        System.out.println(result);

        double res = Area.areaOfRectangle(3, 3);
        System.out.println(res);

       res= Area.areaOfSquare(5);
        System.out.println(res);

        String myName=Area.getAuthorName();
        System.out.println(myName);

        obj.quit();
    }
}
