package com.krk.codeup.c1400;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
9 6
160 165 164 165 150 165 168 145 170
 */
public class Codeup1425 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = 9;
        int k = 6;
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", pq.poll());
            if((i + 1) % k == 0) System.out.printf("\n");
        }
    }
}
