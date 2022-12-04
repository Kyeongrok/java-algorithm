package com.likelion.sort.heap;

import java.util.Arrays;

public class MakeHeap2 {
    public static int[] makeHeap(int[] arr) {
        int parentIdx = 0;
        int leftIdx = 1;
        int rightIdx = 2;

        if(arr[leftIdx] > arr[rightIdx] && arr[leftIdx] > arr[parentIdx]){
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[leftIdx];
            arr[leftIdx] = temp;
        } else if (arr[leftIdx] < arr[rightIdx] && arr[rightIdx] > arr[parentIdx]) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[rightIdx];
            arr[rightIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeHeap(new int[]{6, 5, 7})));
    }
}
