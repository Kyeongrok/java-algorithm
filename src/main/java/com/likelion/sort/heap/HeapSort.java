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
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int greater;

        if (left < arr.length && arr[left] > arr[i]) {
            greater = left;
        } else {
            greater = i;
        }

        if (right < arr.length && arr[right] > arr[greater]) {
            greater = right;
        }

        if (greater != i) {
            arr = swap(arr, i, greater);
            heapify(arr, greater);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        hs.heapify(new int[]{2, 9, 3}, 0);
        hs.heapify(new int[]{2, 3, 9}, 0);
    }
}
