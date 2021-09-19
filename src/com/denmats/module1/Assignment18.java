package com.denmats.module1;

import java.util.*;

public class Assignment18 {

    private  int startNumber;
    private  int endNumber;

    public Assignment18() {
        this.startNumber = takeANumberFromUser();
        this.endNumber = takeANumberFromUser();
    }
    

    private int takeANumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }
        return Math.abs(number);
    }
    
    private Map<Integer, List<Integer>> findDivisorsForEveryNumberFromTheRange(){
        Map<Integer, List<Integer>> result = new HashMap<>();

        setStartAndEndPoint();

        for (int i = startNumber; i <= endNumber; i++) {
            result.put(i, getListOfNumberDivisors(i));
        }

        return result;
    }

    private List<Integer> getListOfNumberDivisors(int number) {
        List<Integer> arrayOfDivisors = new ArrayList<>();
        number = Math.abs(number);
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                arrayOfDivisors.add(i);
            }
        }
        return arrayOfDivisors;
    }

    private void setStartAndEndPoint() {
        if(startNumber > endNumber){
            int temp = endNumber;
            endNumber = startNumber;
            startNumber = temp;
        }
    }


    public void printAllDivisorsForEveryNumbersFromTheRange(){
        Map<Integer, List<Integer>> resultSet = findDivisorsForEveryNumberFromTheRange();
        resultSet.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
