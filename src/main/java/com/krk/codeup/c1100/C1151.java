package com.krk.codeup.c1100;

import java.util.Scanner;

public class C1151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        if(min < 10){
            System.out.println("small");
        } else {
            System.out.println("big");
        }
    }
}
