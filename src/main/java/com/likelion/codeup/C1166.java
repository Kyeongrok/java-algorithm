package com.likelion.codeup;

import java.util.Scanner;

public class C1166 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        if(v % 400 == 0) {
            System.out.println("Leap");
        } else if(v % 4 == 0 && v % 100 != 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Normal");
        }

    }
}
