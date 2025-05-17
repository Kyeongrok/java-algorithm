package com.krk.codeup.c1100;

import java.util.Scanner;

public class C1154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        if(i > j){
            System.out.println(">");
        } else if(i < j) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
