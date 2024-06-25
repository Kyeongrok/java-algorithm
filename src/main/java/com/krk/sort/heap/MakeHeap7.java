package com.krk.sort.heap;

import java.util.Arrays;

public class MakeHeap7 {
    public static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽이 parent보다 크면 greateridx=leftIdx 6 7 5 --> 7 6 5
        if(leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]){
            greaterIdx = leftIdx;
        }

        //오른쪽 자식이 greater 보다 크면
        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]){
            greaterIdx = rightIdx;
        }

        // swap
        int temp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = temp;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        /*
          6[0]
         5[1] 7[2]
        8[3]
         */
        int[] heapedArr = makeHeap(arr, 1);
        /*
          6[0]
         8[1] 7[2]
        5[3]
        6 8 7 5 */
        System.out.println(Arrays.toString(heapedArr));
        /*
          6[0]
         8[1] 7[2]
        5[3]
        6 8 7 5 */
        heapedArr = makeHeap(arr, 0);
        System.out.println(Arrays.toString(heapedArr));
        /*
          8[0]
         6[1] 7[2]
        5[3]
        8 6 7 5 */



    }
}
