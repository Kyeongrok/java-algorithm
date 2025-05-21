package com.krk.codeup.c1400;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Codeup1430 {
    /*
5
2 52 23 55 100
4
5 2 55 99

0 1 1 0
     */
    public static void main(String[] args) {

        // Radix Sort
        Set<Integer> set1 = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int no = sc.nextInt();
            System.out.printf("%d ", set1.contains(no) ? 1 : 0);
        }
    }
}
