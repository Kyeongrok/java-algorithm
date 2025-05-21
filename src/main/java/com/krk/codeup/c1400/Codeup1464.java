package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int k = 4;
        n = sc.nextInt();
        k = sc.nextInt();

        int[][] arr = new int[n][k];

        int v = n * k;
        for (int i = 0; i < n; i++) {
            for (int j = k - 1; j >= 0; j--) {
                arr[i][j] = v--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
