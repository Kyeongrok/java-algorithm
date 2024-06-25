package com.krk.codeup;

import java.util.Scanner;

public class Codeup1290 {
    public static void main(String[] args) {
        // 10의 약수
        int cnt = 0;
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) cnt++;
        }
        System.out.println(cnt);
    }
}
