package com.likelion.prime.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {

    public int solution(int N) {
        List<Integer> nums = new ArrayList<>();

        // 2 ~ 50채우기
        for (int i = 2; i <= N; i++) nums.add(i);

        for (int j = 2; j * j <= N ; j++) {
            // 2의 배수 지우기 2제외
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % j == 0 && nums.get(i) > j) nums.remove(i);
            }
        }
        return nums.size();
    }

    public static void main(String[] args) {
        RemoveMultipleOf rm = new RemoveMultipleOf();
        System.out.println(LocalDateTime.now());
        System.out.println(rm.solution(400_000));
        System.out.println(LocalDateTime.now());

    }
}
