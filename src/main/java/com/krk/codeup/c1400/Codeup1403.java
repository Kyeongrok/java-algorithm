package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1403 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.printf("%d\n", arr[j]);
            }
        }
    }
}
