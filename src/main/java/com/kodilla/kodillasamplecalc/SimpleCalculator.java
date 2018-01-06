package com.kodilla.kodillasamplecalc;

public class SimpleCalculator {

    public double addAToB(double a, double b)
    {
        double c= a + b;
        System.out.println("Result: " + c);
        return c;
    }

    public double subAFromB(double a, double b)
    {
        double d = a - b;
        System.out.println("Result: " + d);
        return d;
       }
    public double multiplyAByB(double a, double b)
    {
        double e = a * b;
        System.out.println("Result: " + e);
        return e;
    }
}
