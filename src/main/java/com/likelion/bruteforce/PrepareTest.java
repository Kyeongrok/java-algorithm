package com.likelion.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrepareTest {
    public int[] solution(int[] answer) {
        /*   1,2,3,4,5 | 1,3,2,4,2
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
         */
        // 첫번째 5문제 2
        // 두번째 0문제 2
        // 세번째 0문제 2
        String answerPattern1 = "12345".repeat(4000);
        String answerPattern2 = "21232425".repeat(1250);
        String answerPattern3 = "3311224455".repeat(1000);

        int[] cnt = {0, 0, 0};
        for (int i = 0; i < answer.length; i++) {
            if(Character.getNumericValue(answerPattern1.charAt(i)) == answer[i]) cnt[0]++;
            if(Character.getNumericValue(answerPattern2.charAt(i)) == answer[i]) cnt[1]++;
            if(Character.getNumericValue(answerPattern3.charAt(i)) == answer[i]) cnt[2]++;
        }

        // 문제2
        // [5, 0, 0] --> max:5 [1]
        // [2, 2, 2] --> max:2 [1,2,3]
        // [1, 0, 1] --> max:1 [1, 3]
        // [1, 1, 0] --> max:1 [1, 2]
        // [0, 1, 1] --> max:1 [2, 3]

        // max와 같으면 idx를(+1) append한다.
        int maxScore = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        List<Integer> studentWithTheMaxScore = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if(maxScore == cnt[i]) studentWithTheMaxScore.add(i+1);
        }
        // List --> Array로
        int[] result = new int[studentWithTheMaxScore.size()];
        for (int i = 0; i < studentWithTheMaxScore.size(); i++) {
            result[i] = studentWithTheMaxScore.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        PrepareTest pt = new PrepareTest();
        var r1 = pt.solution(new int[]{1, 2, 3, 4, 5});
        var r2 = pt.solution(new int[]{1, 3, 2, 4, 2});

        System.out.println(Arrays.toString(r1));
        System.out.println(Arrays.toString(r2));

    }
}
