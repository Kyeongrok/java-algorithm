package com.likelion.sort.heap;

import java.util.Arrays;

public class MakeHeap4 {
    public static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽 노드가 있고 왼쪽이 큰 경우 왼쪽과 교환
        if(leftIdx < arr.length && arr[leftIdx] > arr[parentIdx]){
            greaterIdx = leftIdx;

        // 오른쪽이 있고
        } else if (rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        if (greaterIdx != parentIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeHeap(new int[]{6, 5, 7, 8}, 1)));
        System.out.println(Arrays.toString(makeHeap(new int[]{6, 8, 7, 5}, 0)));

    }
}
