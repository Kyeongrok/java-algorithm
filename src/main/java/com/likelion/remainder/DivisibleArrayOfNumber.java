package com.likelion.remainder;

import java.util.PriorityQueue;

public class DivisibleArrayOfNumber {
    public int[] solution(int[] arr, int divisor) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                pq.add(arr[i]);
            }
        }
        int[] answer = new int[pq.size()];
        int idx = 0;
        while(!pq.isEmpty()) answer[idx++] = pq.poll();
        return answer.length !=0? answer : new int[]{-1};
    }

    public static void main(String[] args) {
    }
}
