package com.likelion.sort.radix1.onlecture;

import java.util.Arrays;

public class R1 {
    public static int[] sort(int[] arr) {
        int[] memo = new int[10];

        for (int i = 0; i < arr.length; i++) {
            memo[arr[i]] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(memo));
        return memo;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 20};
        sort(arr);
    }
}
