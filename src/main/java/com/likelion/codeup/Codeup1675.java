package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1675 {
    public static char decodeCaesar(char c) {
        c -= 97;
        if (c - 3 < 0){
            return (char) (26 + (c - 3) + 97);
        } else {
            return (char) (c + 97 - 3);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != ' ') {
                System.out.printf("%s", decodeCaesar(c));
            } else {
                System.out.printf(" ");
            }
        }
    }
}
