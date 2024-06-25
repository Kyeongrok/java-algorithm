package com.krk.codeup;

import java.util.Scanner;

public class Codeup1272 {
    /*
    1   2  3  4   5  6   7  8
    1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60
    홀수면 1 2 3
    짝수면 10 20 30

    81 82 83 84
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            int k = sc.nextInt();
            if (k % 2 != 0){
                // 홀수
//                System.out.printf("%d ", k / 2 + 1);
                sum += k / 2 + 1;
            } else {
                // 짝수
//                System.out.printf("%d ", k * 5);
                sum += k * 5;
            }
        }
        // 2161
        System.out.println(sum);
    }
}
