package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
