package com.krk.sort.heap;

import java.util.Arrays;

public class MakeHeap6 {
    public int[] getChildrenIdxs(int parentIdx) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        return new int[]{leftIdx, rightIdx};
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

        int parentIdx = 1; // N
        int leftIdx = 3;   // 2N + 1
        int rightIdx = 4;  // 2N + 2

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
