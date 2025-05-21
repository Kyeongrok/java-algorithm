package com.krk.codeup.c1400;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Codeup1452 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        while(!pq.isEmpty()) System.out.println(pq.poll());
    }
}
