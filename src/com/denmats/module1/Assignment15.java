package com.denmats.module1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Assignment15 {

    public void getMultiplicationOfTheFirst200NumbersPoweredBy2(){
        BigInteger bigIntegerStore = BigInteger.ONE;
        for (int i = 2; i <= 200; i++) {
            BigInteger bigInteger = new BigInteger(String.valueOf(i*i));
            bigIntegerStore = bigIntegerStore.multiply(bigInteger);
        }
        System.out.println(bigIntegerStore);
    }
}
