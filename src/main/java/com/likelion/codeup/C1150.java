package com.likelion.codeup;

import java.util.Scanner;

public class C1150 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        for (int i = 1; i < 3; i++) {
            int value = sc.nextInt();
            if(min > value) min = value;
        }
        System.out.println(min);
    }
}
