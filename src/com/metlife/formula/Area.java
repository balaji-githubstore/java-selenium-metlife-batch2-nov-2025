package com.metlife.formula;

public class Area {

    public double areaOfCircle(int r) {
        return 3.14 * r * r;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static double areaOfSquare(double a)
    {
        return a*a;
    }

   public static String getAuthorName()
   {
       return "Balaji Dinakaran";
   }

   public void quit()
   {

   }
}
