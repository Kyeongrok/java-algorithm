package com.krk.codeup;

import java.util.Scanner;

public class Codeup1292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum % 7 == 4) {
            System.out.println("suspect");
        } else {
            System.out.println("citizen");
        }
    }
}
