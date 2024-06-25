package com.krk.codeup;

import java.util.Scanner;

public class C1169 {
    public static void answer(int age){

        int year = 2012 - age + 1;
        int post = year % 100;
        int indicator = 1;
        if(year >= 2000) indicator = 3;
        System.out.printf("%d %d\n", post, indicator);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        answer(i);
    }
}
