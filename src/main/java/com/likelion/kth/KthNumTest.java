package com.likelion.kth;

import java.util.PriorityQueue;

public class KthNumTest {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[]{};
        PriorityQueue<Integer> pq = new PriorityQueue();

        return answer;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        pq.forEach(item-> System.out.println(item));
        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
