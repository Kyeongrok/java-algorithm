package com.krk.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i = 0; // 0번에 들어와야 할 것
        // 0 ~ length - 1 에서 최소값의 index
        int minIdx = i;
        for (int j = 1; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]){
                minIdx = j;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minIdx];
        arr[minIdx] = temp;

        i = 1;
        minIdx = i;
        for (int j = 2; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]){
                minIdx = j;
            }
        }
        temp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
