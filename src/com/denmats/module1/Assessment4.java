package com.denmats.module1;

import java.math.BigDecimal;

public class Assessment4 {
    private final double number;

    public Assessment4(double number) {
        this.number = number;
    }

    /*private double flipFractionalPartOfTheNumber(){
        double num = new BigDecimal(String.valueOf(number)).subtract(new BigDecimal(String.valueOf((int)number))).doubleValue();
        int digit = 0;
        double remainder = 0;
        double reversed = 0;
        for (int i = 0; i < 3; i++) {
            digit =  (int)(num*10);
            BigDecimal temp = new BigDecimal(String.valueOf(num*10)).subtract(new BigDecimal(String.valueOf(digit)));
            remainder = temp.doubleValue();
            reversed = reversed*10 + digit;
            num = new BigDecimal(String.valueOf(remainder)).doubleValue();
        }
        return reversed;
    }*/

    private double flipFractionalPartOfTheNumber(){
        double num = new BigDecimal(String.valueOf(number)).subtract(new BigDecimal((int)number)).doubleValue();
        return num*1000;
    }

    private double flipIntegerPartOfTheNumber(){
        int num = (int) number;
        return (double) num/1000;
    }

    private double getReversedDoubleNumber(){
        return flipFractionalPartOfTheNumber() + flipIntegerPartOfTheNumber();
    }

    public void printReversedDoubleNumber(){
        System.out.println(getReversedDoubleNumber());
    }
}
