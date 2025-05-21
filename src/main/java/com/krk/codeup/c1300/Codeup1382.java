package com.krk.codeup.c1300;

/*
horizontal
 */

public class Codeup1382 {
    public static void main(String[] args) {

        //2 3 4 5
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d x %d = %2d\t", j, i, (i * j));
            }
            System.out.println();
        }

    }
}
