package com.krk.codeup.c1300;

/*
높이 h와 반복휫수 r이 주어질때, 별을 다음과 같이 지그재그로 출력하자.
예) 3 2
               space1    space2
0123**         4         0
012*01*        3         2
01*0123*       2         4
0*012345*
*01234567*
*01234567*
 *      *
  *    *
   *  *
    **

 */

import java.util.Scanner;

public class Codeup1371 {

    public static void main(String[] args) {
        
        int h = 5;
        int r = 1;

        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();

        for (int j = 0; j < h * 2; j++) {
            int r2 = j % h;
            if(j >= h) r2 = 2 * h - j - 1;
            for (int k = 0; k < h - r2 - 1; k++) {
                System.out.printf(" ");
            }
            System.out.printf("%s", "*");
            for (int k = 0; k < r2; k++) {
                System.out.printf("  ");
            }
//            System.out.printf("%d %d\n", j, r2);
            System.out.println("*");
        }
    }
    
}
