package com.krk.codility;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < A.length; i++) {
            if(A[i] > 0){
                pq.add(A[i]);
            }
        }

        int min = 1;
        while(!pq.isEmpty()){
            if (pq.poll() == min){
                min++;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 1, 1})); // 2
        System.out.println(solution.solution(new int[]{1, 2, 3})); // 4
        System.out.println(solution.solution(new int[]{1, 2, 4})); // 3
        System.out.println(solution.solution(new int[]{2, 3, 4})); // 1
    }
}
