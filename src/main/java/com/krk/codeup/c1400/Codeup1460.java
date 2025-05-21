package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1460 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int v = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", v++);
            }
            System.out.println();
        }
    }
}
