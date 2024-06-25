package com.krk.sort.quick.test;

import java.util.Arrays;

public class SeparationToTwoGroups {

    public int[] sort(int[] arr, int startIdx, int endIdx) {

        int pivot = arr[arr.length / 2];
        System.out.println(pivot);
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        // ------------- 여기 아랫줄이 반복됨 -----------
        // 언제까지 반복되는지? leftIdx == rightIdx일 때도 아래 로직이 반복됨
        // ex) leftIdx = 3, rightIdx = 3일 때도

        // 왼쪽과 오른쪽 각각 교환할 index를 정하는 부분 pivot까지 올 수도 있다.
        while(arr[leftIdx] < pivot) leftIdx += 1;   // <=아닙니다.
        while(arr[rightIdx] > pivot) rightIdx -= 1;   // <=아닙니다.
        // leftIdx = 4, rightIdx = 7 그대로 왜 냐하면 25는 교환 대상이기 때문입니다.

        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
        leftIdx += 1;
        rightIdx -= 1;
        System.out.printf("4:%d 7:%d\n", arr[4], arr[7]); // 25, 40
        System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx); // 5, 6
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length / 2];
        System.out.println(pivot);
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        while(arr[leftIdx] < pivot) leftIdx += 1;   // <=아닙니다.
        while(arr[rightIdx] > pivot) rightIdx -= 1;   // <=아닙니다.
        // leftIdx = 4, rightIdx = 7 그대로 왜 냐하면 25는 교환 대상이기 때문입니다.

        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
        leftIdx += 1;
        rightIdx -= 1;
        System.out.printf("4:%d 7:%d\n", arr[4], arr[7]); // 25, 40
        System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx); // 5, 6
        System.out.println(Arrays.toString(arr));

        temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
        leftIdx += 1;
        rightIdx -= 1;
        System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx); // 5, 6
        System.out.println(Arrays.toString(arr));

    }
}
