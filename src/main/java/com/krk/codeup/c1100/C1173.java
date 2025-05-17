package com.krk.codeup.c1100;

import java.util.Scanner;

public class C1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int k = (24 + i) * 60 + j - 30;

        System.out.printf("%d %d", (k / 60) % 24, k % 60);
    }
}
