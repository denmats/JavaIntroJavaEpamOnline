package com.denmats.module1;

import java.util.*;

public class Assignment19 {

    private  int first;
    private  int second;
    private Set<Integer> digits;
    private List<Integer> listOfTwoGivenNumbers;

    public Assignment19(int first, int second) {
        this.first = Math.abs(first);
        this.second = Math.abs(second);
        digits = new HashSet<>();
        listOfTwoGivenNumbers = Arrays.asList(this.first, this.second);
    }

    public void printDigitsAreIncludedInBothNumbers(){
        System.out.println(getAllDigitsIncludedInGivenNumbers());
    }

    private Set<Integer> getAllDigitsIncludedInGivenNumbers() {
        for (int i = 0; i < 2; i++) {
            int number = listOfTwoGivenNumbers.get(i);
            List<Integer> integerList = getAllDigitsOfTheNumber(number);
            digits.addAll(integerList);
        }
        return digits;
    }

    private List<Integer> getAllDigitsOfTheNumber(int number) {
        List<Integer> integers = new ArrayList<>();
        int length = getNumberLength(number);
        while(length > 0){
            integers.add(number % 10);
            number /= 10;
            length--;
        }
        return integers;
    }

    private int getNumberLength(int num){
        if(num > 0){
            return (int) Math.log10(num)+1;
        }else {
            return 0;
        }
    }
}
