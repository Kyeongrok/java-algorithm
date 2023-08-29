package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int v = sc.nextInt();
        int max = v;
        int min = v;
        for (int i = 1; i < cnt; i++) {
            v = sc.nextInt();
            if(max < v) max = v;
            if(min > v) min = v;
        }
        System.out.printf("%d %d\n", max, min);
    }
}
