package com.krk.codeup;

import java.util.Scanner;

public class Codeup1294 {
    public static char encodeCaesar(char c) {
        c -= 97;
        if (c + 3 > 25){
            return (char) (((c + 3) % 26) + 97);
        } else {
            return (char) (c + 97 + 3);
        }
    }
    public static void main(String[] args) {

//        System.out.println(encodeCaesar('x'));

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != ' ') {
                System.out.printf("%s", encodeCaesar(c));
            } else {
                System.out.printf(" ");
            }
        }
    }
}
