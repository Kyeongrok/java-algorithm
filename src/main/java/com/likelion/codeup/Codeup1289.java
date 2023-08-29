package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1289 {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int square = sc.nextInt() * sc.nextInt();
            if (square > max) max = square;
        }

        System.out.println(max);
    }
}
