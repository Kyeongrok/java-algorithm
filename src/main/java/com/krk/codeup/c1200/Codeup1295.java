package com.krk.codeup.c1200;

import java.util.Scanner;

public class Codeup1295 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.printf("%s", Character.toLowerCase(c));
            } else {
                System.out.printf("%s", Character.toUpperCase(c));
            }

        }
    }
}
