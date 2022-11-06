package com.likelion.prime.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopCheckIdx {
    public static void printNums(int[] nums, boolean[] checks) {
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) {
                System.out.printf("%d|", nums[i]);
                cnt++;
            }
        }
        System.out.println();
        System.out.println("size:"+cnt);
    }

    public int solution(int N) {
        if (N == 2) return 1;
        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~49까지 nums에 채우기

        for (int j = 0; j * j <= N; j++) {// N == 49
            int multipleOf = nums[j]; // j=0 nums[0] = 2
            // 초항이 2 2n인 2 4 6 8 10
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
//            printNums(nums, checks);
        }
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        LoopCheckIdx sieve = new LoopCheckIdx();

        System.out.println(LocalDateTime.now());
        System.out.println(sieve.solution(1_000_000));
        System.out.println(LocalDateTime.now());

    }
}
