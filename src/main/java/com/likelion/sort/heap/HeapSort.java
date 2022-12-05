package com.likelion.sort.heap;

import java.util.Arrays;

public class HeapSort {
    public void heapSort(int[] arr) {

    }

    private int[] swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        return arr;
    }

    public void heapify(int[] arr, int i) { // i는 부모 idx
        int leftIdx = i * 2 + 1;
        int rightIdx = i * 2 + 2;
        int greaterIdx;

        if (leftIdx < arr.length && arr[leftIdx] > arr[i]) {
            greaterIdx = leftIdx;
        } else {
            greaterIdx = i;
        }

        if (rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        if (greaterIdx != i) {
            arr = swap(arr, i, greaterIdx);
            heapify(arr, greaterIdx);
        }
    }

    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        int[] arr = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            hs.heapify(arr, i);
            System.out.println(Arrays.toString(arr));
        }
        for (int i = arr.length - 1; i > 0 ; i--) {

        }
    }
}
