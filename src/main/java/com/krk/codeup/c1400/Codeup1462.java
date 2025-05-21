package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1462 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        n = sc.nextInt();

        int v = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", i + 1 + j * n);
                v+= n;
            }
            System.out.println();
        }
    }
}
