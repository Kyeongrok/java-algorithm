package com.krk.codeup.c1300;

import java.util.Scanner;

public class Codeup1366 {

//        123456789
// 1      *********
// 2      **     **
// 3      * *   * *
// 4      *  * *  *
// 5      *   *   *
// 6      *  * *  *
// 7      * *   * *
// 8      **     **
// 9      *********



    //2   **        3, 4
    //3   **        3, 4
    //4  *  *       2, 5
    //5 *    *      1, 6

    public static void main(String[] args) {

        int n = 5;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0 || j == n - 1 || i == n - 1 || j==i || j==n - i - 1 || j == n / 2 || i == n / 2){
                    System.out.printf("%s", "*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

    }
}