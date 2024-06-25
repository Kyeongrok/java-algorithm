package com.krk.sort.heap;

import java.util.Arrays;

public class MakeHeap3 {
    public static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;

        // 왼쪽이 큰 경우 왼쪽과 교환
        if(arr[leftIdx] > arr[rightIdx] && arr[leftIdx] > arr[parentIdx]){
            // 이 로직의 경우 오른쪽이 없으면 성립하지 않는다.
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[leftIdx];
            arr[leftIdx] = temp;
        // 오른쪽이 큰 경우 오른쪽과 교환
        // 오른쪽은 없는 경우가 있다
        } else if (rightIdx < arr.length - 1 && arr[leftIdx] < arr[rightIdx] && arr[rightIdx] > arr[parentIdx]) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[rightIdx];
            arr[rightIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeHeap(new int[]{6, 5, 7, 8}, 1)));
    }
}
