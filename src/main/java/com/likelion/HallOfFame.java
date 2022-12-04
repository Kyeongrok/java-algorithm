package com.likelion;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        //
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {
            // i까지의 최대
            if(pq.size() < k){
                pq.add(score[i]);
            } else if (pq.peek() < score[i]) {
                pq.poll();
//                System.out.printf("꺼낸값:%d\n", pq.poll());
                pq.add(score[i]);
            }
//            System.out.printf("i:%d pq.size:%d peek:%d score[i]:%d \n",i,pq.size(), pq.peek(), score[i]);
            answer[i] = pq.peek();
        }
        return answer;
    }
    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        var r = hallOfFame.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        r = hallOfFame.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        System.out.println(Arrays.toString(r));
    }
}
