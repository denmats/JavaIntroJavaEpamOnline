package com.denmats.module1;

public class Assignment8 {

    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public Assignment8(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getMax(){
        double minValueOfAAndB = a - b > 0 ? b : a;
        double minValueOfCAndD = c - d > 0 ? d : c;
        return minValueOfAAndB - minValueOfCAndD > 0 ? minValueOfAAndB : minValueOfCAndD;
    }
}
