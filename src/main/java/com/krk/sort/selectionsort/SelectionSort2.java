package com.krk.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length - 1; i++) {

            // 0 ~ length - 1 에서 최소값의 index
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
