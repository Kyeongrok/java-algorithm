package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1468 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int k = 4;
        n = sc.nextInt();
        k = sc.nextInt();
        int[][] arr = new int[n][k];


        // n이 홀수면 왼쪽 시작 n이 짝수면 오른쪽 시작

        boolean directionToRight = n % 2 != 0;

        int v = n * k;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][directionToRight ? j : k - j - 1] = v--;
            }
            directionToRight = !directionToRight;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
