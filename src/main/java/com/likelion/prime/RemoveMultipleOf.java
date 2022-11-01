package com.likelion.prime;

import java.util.Arrays;

public class RemoveMultipleOf {
    public static void printNums(int[] nums, boolean[] checks) {
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]){
                System.out.printf("%d|",nums[i]);
                cnt+=1;
            }
        }
        System.out.println();
        System.out.printf("cnt:%d\n", cnt);
    }

    public static void main(String[] args) {
        // 2~50생성
        int[] nums = new int[49];
        for (int i = 0; i < nums.length; i++) nums[i] = i+2;

        boolean[] checks = new boolean[49];
        Arrays.fill(checks, true);

        // 2의 배수 지우기
        int multipleOf = 2;
        //꼭 2부터 시작 해야 함 0,1은 2,3인데 prime이기 때문
        for (int i = 2; i < checks.length; i+=multipleOf) {
            checks[i] = false;
        }
        printNums(nums, checks);

        // 3의 배수 지우기
        multipleOf = 3;
        // 6부터 지웁니다. 2 3 4 5 6 이므로 4번부터 지웁니다
        for (int i = 4; i < checks.length; i+=multipleOf) {
            checks[i] = false;
        }
        printNums(nums, checks);

        // 4의 배수 지우기
        // 2의 배수에서 지웠으므로 넘어갑니다.

        // 5의 배수 지우기
        multipleOf = 5;
        // 6부터 지웁니다. 2 3 4 5 6 7 8 9 10 11 이므로 8번부터 지웁니다
        for (int i = 8; i < checks.length; i+=multipleOf) {
            checks[i] = false;
        }
        printNums(nums, checks);
    }
}
