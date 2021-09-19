package com.denmats.module1;

public class Assignment11 {

    private final double x;

    public Assignment11(double x) {
        this.x = x;
    }

    public void printAResultOfCalc(){
        System.out.println(getResult());
    }

    private double getResult() {
        double y = 0;
        if(x <= 3){
            y = x * x - 3 * x + 9;
        }
        else{
            y = 1 /(x * x * x + 6);
        }
        return y;
    }
}
