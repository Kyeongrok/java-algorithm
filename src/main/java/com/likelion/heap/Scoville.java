package com.likelion.heap;

import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while (pq.size() >= 2 && pq.peek() < K) {
//            System.out.println(pq.peek());
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a + (b * 2));
            answer ++;
        }

        if(pq.peek() >= K){
            return answer;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 9, 10, 12};
        arr = new int[]{0, 0};
        Scoville scoville = new Scoville();
        var r = scoville.solution(arr, 0);
        System.out.println(r);
    }
}
