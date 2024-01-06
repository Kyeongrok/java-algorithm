package com.likelion.codeup;

import java.util.Scanner;

public class C1165 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        while(i < 90) {
            j++;
            i += 5;
        }
        System.out.println(j);
    }
}
