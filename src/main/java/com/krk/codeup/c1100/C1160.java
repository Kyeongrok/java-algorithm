package com.krk.codeup.c1100;

import java.util.Scanner;

public class C1160 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("oh my god");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("enjoy");
                break;
        }
    }
}
