package com.krk.codeup.c1400;

import java.util.Scanner;

/*
입력이 3인 경우 다음과 같이 출력한다.
3 2 1
4 5 6
9 8 7
 */

public class Codeup1469 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        n = sc.nextInt();
        int[][] arr = new int[n][n];

        int v = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean directionRight = i % 2 != 0;
                arr[i][directionRight ? n - j - 1 : j] = v++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
