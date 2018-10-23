package org.homedevelop.hw_java;

public class Main {

    public static void main(String[] args) {
        System.out.println(evaluateArea(21));
        System.out.println(evaluatePerimeter(12));
    }

    public static double evaluateArea(double r) {
        double s = Math.PI * r * r;
        if(r<=0)
            return 0;
        else
            return s;
    }

    public static double evaluatePerimeter(double r) {
        double p = 2 * Math.PI * r;
        if(p<=0)
            return 0;
        else
            return p;
    }
}
