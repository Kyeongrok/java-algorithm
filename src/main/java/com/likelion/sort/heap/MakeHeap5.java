package com.likelion.sort.heap;

import java.util.Arrays;

public class MakeHeap5 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

        // 5 와 8교환
        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        System.out.println(Arrays.toString(arr));

        // 6과 8교환
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
