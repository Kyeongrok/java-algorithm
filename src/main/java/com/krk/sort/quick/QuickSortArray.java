package com.krk.sort.quick;

import java.util.Arrays;

public class QuickSortArray {
    public int[] quickSort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        int pivot = arr[(leftIdx + rightIdx) / 2];

        while (leftIdx <= rightIdx) {
            while(arr[leftIdx] < pivot) leftIdx += 1;
            while(arr[rightIdx] > pivot) rightIdx -= 1;
            if (leftIdx <= rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }
        if(startIdx < rightIdx) quickSort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) quickSort(arr, leftIdx, endIdx);
        return arr;
    }
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArray qs = new QuickSortArray();
        var r = qs.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(r));

    }
}
