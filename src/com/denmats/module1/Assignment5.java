package com.denmats.module1;

public class Assignment5 {

    private final int timeInSeconds;

    public Assignment5(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public void displayGivenTimeInFormatToHHMMSS(){
        int hours = timeInSeconds/3600;
        int minutes = timeInSeconds/60 - hours*60;
        int seconds = timeInSeconds - hours*3600 - minutes*60;
        System.out.printf("%dч %dмин %dc",hours,minutes,seconds);
    }
}
