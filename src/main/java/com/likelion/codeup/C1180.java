package com.likelion.codeup;

import java.util.Scanner;

public class C1180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = n / 10;
        int r = n % 10;

        int k = ((r * 10 + q) * 2) % 100;
        System.out.println(k);
        System.out.println(k <= 50?"GOOD":"OH MY GOD");
    }
}
