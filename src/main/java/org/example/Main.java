package org.example;

import java.math.BigInteger;

public class Main {
    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {

        System.out.println(getFactorial(100));
    }
}
