package com.krk.codeup.c1100;

import java.util.Scanner;

public class Codeup1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

        if(f >= 50 && f <= 70){
            System.out.println("win");
        } else if(f % 6 == 0){
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
