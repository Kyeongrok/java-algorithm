package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1410 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String brackets = "((())()(()))";
        brackets = sc.nextLine();

        int open = 0;
        int close = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if('(' == brackets.charAt(i)){
                open++;
            } else {
                close++;
            }
        }
        System.out.printf("%d %d", open, close);
    }
}
