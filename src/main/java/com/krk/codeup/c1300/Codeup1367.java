
package com.krk.codeup.c1300;

import java.util.Scanner;

/*
n=4
000****
00****
0****
****

 */
public class Codeup1367 {
    public static void main(String[] args) {

        int n = 4;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
