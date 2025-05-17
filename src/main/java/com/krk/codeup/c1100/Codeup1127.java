package com.krk.codeup.c1100;

import java.util.Scanner;

public class Codeup1127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0f;
        for (int i = 0; i < 3; i++) {
            float i1 = sc.nextFloat();
            long i2 = sc.nextLong();
            sum += i1 * i2;
        }
        System.out.printf("%.1f", sum);
    }
}
