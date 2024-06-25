package com.krk.binarysearch.test;

public class BinarySearch {
    public static void main(String[] args) {
        int targetNum = 7;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        // 중간값 찾기
        int startIdx = 0;
        int endIdx = nums.length - 1;
        int targetIdx = -1;

        while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            int midValue = nums[midIdx];
            // 인덱스(시작점, 끝점) 옮기기
            if (midValue > targetNum) { //  1 -(3)- 5 6 --- 11
                endIdx = midIdx - 1;
            } else if (midValue < targetNum) { //  1 --- 6 7 --(8)- 11
                startIdx = midIdx + 1;
            } else {
                // 같은경우 = 답
                // 같은지 비교하기
                System.out.println(midIdx);
                targetIdx = midIdx;
                break;
            }
        }
        System.out.println(targetIdx);
    }
}
