
package com.krk.codeup.c1300;

import java.util.Scanner;

/*
n=4
****       0 0
0****      1 1
00****     2 2
000****    3 3


000****    0 3
00****     1 2
0****      2 1
****       3 0



 */
public class Codeup1368 {
    public static void main(String[] args) {

        int h = 5;
        int k = 4;
        String d = "L";

        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        k = sc.nextInt();
        d = sc.nextLine().trim();


        for (int i = 0; i < h; i++) {
            int until = d.equals("R") ? h - i - 1 : i;
            for (int j = 0; j < until; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.printf("*");
            }
            if(i < h - 1)
                System.out.println();
        }

    }
}
