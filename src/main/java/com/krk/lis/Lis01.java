package com.krk.lis;

import java.util.Arrays;

// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
public class Lis01 {

    public static int maxSubArray(final int[] arr) {

        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -10};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
