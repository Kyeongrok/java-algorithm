package com.krk.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class DiskController {
    public static void main(String[] args) {
        int[][] arr = {{0, 3}, {1, 9}, {2, 6}};
        Queue<int[]> pq = new PriorityQueue<>((a, b)-> b[0] - a[0]);
        for (var arr1 : arr) {
            pq.add(arr1);
        }

        while(!pq.isEmpty()) System.out.println(Arrays.toString(pq.poll()));
    }
}
