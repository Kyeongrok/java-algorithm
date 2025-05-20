package com.krk.codeup.c1300;

import java.util.Scanner;

public class Codeup1369 {

    /*
    예를 들어, n=10, k=3이면,
            0123456789
     0      **********
     1      **  *  * *    (1,1), (1,4), (1,7)
     2      *  *  *  *    (2,3), (2,6)
     3      * *  *  **    (3,2), (3,5), (3,8)
     4      **  *  * *    (4,1), (4,4), (4,7)
     5      *  *  *  *
     6      * *  *  **
     7      **  *  * *
     8      *  *  *  *
     9      **********


            0123456789
     0      **********
     1      **  *  * *    (1,1)부터 +3씩 1 -> 1 4 7
     2      *  *  *  *    (2,3)부터 +3씩 2 ->  3 6 9
     3      * *  *  **    (3,2)부터 +3씩 3 -> 2 5 8
     4      **  *  * *    (4,1)
     5      *  *  *  *
     6      * *  *  **
     7      **  *  * *
     8      *  *  *  *
     9      **********

     */

    public static void main(String[] args) {

        int n = 10;
        int k = 3;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        int first_x = k - 1;
        for (int i = 0; i < n; i++) {
            int current_x = first_x;
            for (int j = 0; j < n; j++) {
                if(j == current_x){
                    System.out.printf("*");
                    current_x += k;
                }else if(j == 0 || i == 0 || j == n - 1 || i == n - 1){
                    System.out.printf("%s", "*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
            if(first_x == 0){
                first_x = first_x + k - 1;
            } else{
                first_x--;
            }
        }

    }
}


