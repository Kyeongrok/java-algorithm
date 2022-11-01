package com.likelion.prime;

import java.util.Arrays;

public class RemoveMultipleOfArray2 {
    public int printNums(int[] nums, boolean[] checks) {
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]){
                System.out.printf("%d|",nums[i]);
                cnt+=1;
            }
        }
        System.out.println();
        System.out.printf("cnt:%d\n", cnt);
        return cnt;
    }

    public int solution(int N) {
        if (N == 2) return 1; // 이 조건이 없으면 프로그래머스 통과 못함
        int[] nums = new int[N - 1];
        for (int i = 0; i < nums.length; i++) nums[i] = i+2;

        boolean[] checks = new boolean[N - 1];
        Arrays.fill(checks, true);

        for (int j = 0; j * j <= N; j++) {
            int multipleOf = nums[j];
            for (int i = nums[j] + j; i < checks.length; i+=multipleOf) {
                checks[i] = false;
            }
            printNums(nums, checks);
        }
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) if(checks[i]) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        RemoveMultipleOfArray2 sieve = new RemoveMultipleOfArray2();
        sieve.solution(2);

    }
}
