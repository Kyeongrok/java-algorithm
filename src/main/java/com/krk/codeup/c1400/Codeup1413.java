package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1413 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = "Speaking Parrot";
        line = sc.nextLine();

        for (int i = line.length() - 1; i >= 0; i--) {
            System.out.printf("%s", line.charAt(i));
        }
    }
}
