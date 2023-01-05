package com.likelion.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame2 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(list.size() < k){
                // k개 까지는 그냥 넣고
                list.add(score[i]); //
            } else {
                Collections.sort(list);
                // 최소값
                if(list.get(0) < score[i]){
                    list.remove(0);
                    // 다시 넣고
                    list.add(score[i]);
                }
            }
            // 정렬해서
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        return answer;
    }
    public static void main(String[] args) {

        HallOfFame2 hallOfFame2 = new HallOfFame2();
        System.out.println(Arrays.toString(hallOfFame2.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }
}
