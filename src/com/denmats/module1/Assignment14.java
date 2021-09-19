package com.denmats.module1;

public class Assignment14 {

    public void getSumOfTheFirst100NumbersPoweredBy2(){
        int i = 1;
        int sum = 0;
        while (i !=100){
            sum += i*i;
            i++;
        }
        System.out.println(sum);
    }
}
