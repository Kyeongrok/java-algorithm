package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1461 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        n = sc.nextInt();

        int v = n;
        for (int i = 0; i < n; i++) {
            v = n * (i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", v - j);
            }
            System.out.println();
        }
    }
}
