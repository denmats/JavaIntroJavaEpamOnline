package com.denmats.module1;

public class Assignment1 {
    private final double a;
    private final double b;
    private final double c;

    public Assignment1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printTheResultOfCalculation(){
        System.out.println(getResultOfCalculation());
    }

    private double getResultOfCalculation(){
        return ((a-3)*b/2)+c;
    }
}
