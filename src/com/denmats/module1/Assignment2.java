package com.denmats.module1;

public class Assignment2 {
    private final double a;
    private final double b;
    private final double c;

    public Assignment2(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printTheResultOfCalculation(){
        System.out.println(getResultOfCalculation());
    }

    private double getResultOfCalculation() {
        double result = 0;
        try {
            result = (b + getSqrt()) / 2 * a - (Math.pow(a, 3) * c + Math.pow(b, -2));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }

    private double getSqrt() throws ArithmeticException{
        return Math.sqrt(b * b + 4 * a * c);
    }

}
