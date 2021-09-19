package com.denmats.module1;

public class Assignment16 {

    private final double e;

    public Assignment16(double e) {
        this.e = e;
    }

    public void getSumOfItemsGraterThanNumberGiven(){
        boolean flag = true;
        int counter = 1;
        double sum = 0;
        while (flag){
            double item = 1/Math.pow(2,counter)+1/Math.pow(3,counter);
            if(item >= e){
                sum += item;
                counter++;
            }else {
                flag = false;
            }
        }
        System.out.println(sum);
    }
}
