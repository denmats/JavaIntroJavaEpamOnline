package com.denmats.module1;

public class Assignment7 {

    private final double firstAngleOfTriangle;
    private final double secondAngleOfTriangle;

    public Assignment7(double firstAngleOfTriangle, double secondAngleOfTriangle) {
        this.firstAngleOfTriangle = firstAngleOfTriangle;
        this.secondAngleOfTriangle = secondAngleOfTriangle;
    }

    public void printIfATriangleExistsAndIfTheTriangleIsRight(){
        double missingAngle = 180.0-firstAngleOfTriangle - secondAngleOfTriangle;
        boolean noneOfTheAnglesEqualZero = firstAngleOfTriangle > 0 && secondAngleOfTriangle > 0 && missingAngle > 0;

        if(noneOfTheAnglesEqualZero) {
            displayIfTriangleARightOrNot(missingAngle);
        }
        else {
            System.out.println("The triangle doesn't exist");
        }
    }

    private void displayIfTriangleARightOrNot(double thirdAngleOfTriangle) {
        if (firstAngleOfTriangle == 90.0 || secondAngleOfTriangle == 90.0 || thirdAngleOfTriangle == 90.0){
            System.out.println("The triangle exists and it is a right triangle");
        }else {
            System.out.println("The triangle exists but it is not a right triangle");
        }
    }
}
