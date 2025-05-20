package com.krk.codeup.c1300;

/*
높이 h와 반복휫수 r이 주어질때, 별을 다음과 같이 지그재그로 출력하자.
예) 3 2
*
 *
  *
 *
*
*
 *
  *
 *
*

 */

import java.util.Scanner;

public class Codeup1370 {

    public static void main(String[] args) {
        
        int h = 5;
        int r = 1;

        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < h * 2 - 1; j++) {
                int r2 = j > h - 1 ? 2 * h - 2 - j : j % h;
                for (int k = 0; k < r2; k++) {
                    System.out.printf(" ");
                }
//                System.out.printf("%d %d\n", j, r2);
                System.out.println("*");
            }
        }
        
    }
    
}
