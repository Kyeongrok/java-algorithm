package com.krk.codeup.c1200;

import java.util.Scanner;

public class Codeup1291 {
    /*
    GCD
    10 20
    20 - 10
    30 - 10 = 20
    20 - 10 = 10

    15 - 10 = 5
     */
    public static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a - b);
        } else if (b > a) {
            return gcd(a, b - a);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gcd(gcd(sc.nextInt(), sc.nextInt()), sc.nextInt()));
    }
}
