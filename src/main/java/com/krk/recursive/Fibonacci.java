package com.krk.recursive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacciNums = new ArrayList<>();
        // n = 7, 1 1 2 3 5 8 13 --> 7개
        // n = 8, 1 1 2 3 5 8 13 21 --> 8개
        int i = 0;
        fibonacciNums.add(1);
        i = 1;
        fibonacciNums.add(1);

        i = 2;
        fibonacciNums.add(2); // fibonacciNums.get(0) + finbonacciNums(1)
    }
}
