package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long j = sc.nextLong();
        System.out.printf("%d + %d = %d\n", i, j, i + j);
        System.out.printf("%d - %d = %d\n", i, j, i - j);
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        System.out.printf("%d / %d = %d\n", i, j, i / j);
        System.out.printf("%d %% %d = %d", i, j, i % j);
    }
}
