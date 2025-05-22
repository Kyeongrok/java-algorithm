package com.krk.codeup.c1500;

import java.util.Scanner;

/*
5 2
-1 -1 0 6 7
0 0 -1 1 3
-1 1 1 3 4
 0 3 2 4 -1
-1 -1 -1 -1 -1
 */
public class Codeup1521 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;
        int k = 2;
        n = sc.nextInt();
        k = sc.nextInt();

        int[][] arr = new int[n][k];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int in = sc.nextInt();
                if(in > -1) {
                    if(in + k >= 0 && in + k <= 5) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
