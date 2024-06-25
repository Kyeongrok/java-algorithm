package com.krk.binarysearch.simplesearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int targetIdx = -1;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int targetNumber = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == targetNumber) {
                targetIdx = i;
                System.out.println(targetIdx + 1);
                break;
            };
        }
        if(targetIdx == -1) System.out.println(targetIdx);
    }
}
