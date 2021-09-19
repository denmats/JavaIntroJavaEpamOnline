package com.denmats.module1;

import java.util.Scanner;

public class Assignment12 {

    public void printASumOfAllIntegersUpToTheIntegerEntered(){
        System.out.println(getASumOfAllIntegersUpToTheIntegerEntered());
    }

    private int getASumOfAllIntegersUpToTheIntegerEntered(){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int userInput = scanner.nextInt();
            if( userInput > 0){
                for (int i = 0; i < userInput; i++) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
