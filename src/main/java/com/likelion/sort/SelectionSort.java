package com.likelion.sort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;


public class SelectionSort {
    public int[] selectionSort(int[] arr, BiPredicate<Integer, Integer> bp) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (bp.test(arr[swapIdx], arr[j])) swapIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr, (a, b) -> a < b);
        ss.selectionSort(arr, (a, b) -> a > b);

        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;

        BiPredicate<Integer, Integer> bp = (a, b) -> a > b;

    }
}
