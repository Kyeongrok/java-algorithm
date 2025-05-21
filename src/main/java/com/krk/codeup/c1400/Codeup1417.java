package com.krk.codeup.c1400;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Codeup1417 {
    public static void main(String[] args) {
       // 150 145 155 165 175 170 185 180 177 190

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            pq.add(sc.nextInt());
        }
        for (int i = 0; i < 7; i++) {
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}
