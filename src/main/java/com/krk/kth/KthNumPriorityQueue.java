package com.krk.kth;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumPriorityQueue {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                pq.add(arr[j]);
            }
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = pq.poll();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        KthNumPriorityQueue kthNum = new KthNumPriorityQueue();
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(kthNum.solution(arr, commands)));;
    }
}
