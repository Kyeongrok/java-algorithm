package com.krk.codeup.c1100;

import java.util.Scanner;

public class C1168 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        int k = i / 10000;
        if(j < 3) {
            System.out.println(2012 - (1900 + k - 1));
        } else {
            System.out.println(2012 - (2000 + k - 1));
        }
    }
}
