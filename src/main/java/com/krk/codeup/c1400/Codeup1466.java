package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1466 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
        int k = 5;
        n = sc.nextInt();
        k = sc.nextInt();

        int[][] arr = new int[n][k];

        int v = n * k;
        for (int i = 0; i < n; i++) {
            int start = v - i;
            for (int j = 0; j < k; j++) {
                System.out.printf("%d ", start - (j * n));
            }
            System.out.println();
        }
    }
}
