package com.krk.codeup.c1200;

import java.util.Scanner;

public class C1201 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if(v >= 90){
            System.out.println("A");
        } else if (v >= 80) {
            System.out.println("B");
        } else if (v >= 70) {
            System.out.println("C");
        }else if (v >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
