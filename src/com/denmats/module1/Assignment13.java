package com.denmats.module1;


public class Assignment13 {

    private final double intervalStartPoint;
    private final double intervalEndPoint;
    private final int step;

    public Assignment13(double intervalStartPoint, double intervalEndPoint, int step) {
        this.intervalStartPoint = intervalStartPoint;
        this.intervalEndPoint = intervalEndPoint;
        this.step = step;
    }

    public void getAResultOfFunctionWithinAnIntervalGivenWithAStepGiven(){

        for (double x = intervalStartPoint; x < intervalEndPoint; x += step) {

                if( x > 2){
                    System.out.println("X = "+x+" The Result is "+ x);
                }
                else {
                    System.out.println("X = "+x+" The Result is "+ -x);
                }
            }
        }
    }

