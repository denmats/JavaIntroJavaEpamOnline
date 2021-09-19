package com.denmats.module1;

public class Assignment9 {

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;

    public Assignment9(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void printIfThreePointsAreCollinear(){
        System.out.println(checkIfThreePointsAreCollinear());
    }

    private boolean checkIfThreePointsAreCollinear(){
        /*If the area of a triangle created by given points is equal to zero, the points are collinear*/
        double part1 = (pointA.x - pointB.x) * (pointB.x - pointC.x);
        double part2 = ((pointA.y - pointB.y)*(pointB.y -pointC.y));
        return 0.5*(part1 - part2) == 0;
    }

    static class Point{
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}


