package com.krk.stack;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumberWithoutStack {
    public int[] solution(int[] arr) {

        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            // list의 마지막 번째와 arr의 현재 값 비교
            if(answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        var arr = new int[]{1, 1, 3, 3, 0, 1, 1};

        HateSameNumberWithoutStack hsn = new HateSameNumberWithoutStack();
        hsn.solution(arr);

    }
}
