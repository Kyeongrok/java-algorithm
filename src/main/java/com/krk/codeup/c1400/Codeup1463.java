package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        n = sc.nextInt();

        int v = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", i + j * n);
                v+= n;
            }
            System.out.println();
        }
    }
}
