package com.krk.codeup.c1300;

import java.util.Scanner;

public class Codeup1365 {

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

    // n = 3
    // ***
    // ***
    // ***

    // n = 4
    // ****
    // ****
    // ****
    // ****


    // n = 5, x출력
    // *****
    // ** **
    // * * *
    // ** **
    // *****


    // n = 5, \출력
    // *
    // **
    // * *
    // *  *
    // *****


    // n = 6
    //  123456
    //1 ******      1, 6
    //2 **  **      2, 5
    //3 * ** *      3, 4
    //4 * ** *      3, 4
    //5 **  **      2, 5
    //6 ******      1, 6


    // n = 6
    //  123456
    //1 *    *      1, 6
    //2  *  *       2, 5
    //3   **        3, 4
    //4   **        3, 4
    //5  *  *       2, 5
    //6 *    *      1, 6


    // n = 6
    //  012345
    //0 *    *      1, 6
    //1  *  *       2, 5
    //2   **        3, 4
    //3   **        3, 4
    //4  *  *       2, 5
    //5 *    *      1, 6

    public static void main(String[] args) {

        int n = 4;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0 || j == n - 1 || i == n - 1 || j==i || j==n - i - 1){
                    System.out.printf("%s", "*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

    }
}