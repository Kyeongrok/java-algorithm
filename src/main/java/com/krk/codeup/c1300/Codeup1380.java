package com.krk.codeup.c1300;

import java.util.Scanner;

public class Codeup1380 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == n) System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
