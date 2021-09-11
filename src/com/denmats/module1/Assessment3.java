package com.denmats.module1;

public class Assessment3 {
    private final double x;
    private final double y;

    public Assessment3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printTheResultOfCalculation(){
        System.out.println(getResultOfCalculation());
    }

    private double getResultOfCalculation(){
        double result = 0;
        try{
            result = getAdditionOfSinusAndCosine() / getSubtractionOfCosineAndSinus() * getTan();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return result;
    }

    private double getTan() {
        return Math.tan(x*y);
    }

    private double getSubtractionOfCosineAndSinus() {
        return Math.cos(x)-Math.sin(y);
    }

    private double getAdditionOfSinusAndCosine() {
        return Math.sin(x)+Math.cos(y);
    }
}
