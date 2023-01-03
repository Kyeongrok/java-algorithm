package com.likelion.heap;

import java.util.PriorityQueue;

public class Scoville2 {

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        // 우선순위 큐에 넣기
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        // 섞기
        int answer = 0;
        while (pq.size() >= 2 && pq.peek() < K){
            int mix = pq.poll() + (pq.poll() * 2);
            pq.add(mix);
            answer++;
        }

        if(pq.peek() < K) return -1;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1};

    }
}
