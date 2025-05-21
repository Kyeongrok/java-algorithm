package com.krk.codeup.c1300;

import java.util.Scanner;

public class Codeup1378 {
    public static void main(String[] args) {
        int n = 5;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int accumulatedValue = 0;
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            accumulatedValue += i;
            totalSum += accumulatedValue;
        }
        System.out.println(totalSum);
    }
}
