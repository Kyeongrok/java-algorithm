package com.krk.sort.radix1.onlecture;

import java.util.*;

public class R3 {
    public static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // 중복제거 하여 자릿수 구하기
            if (arr[i] == 0) set.add(1);
            else set.add((int)(Math.log10(arr[i])+1));
        }

        // 중복 제거된 자릿수를 arr에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }

    public int[] sort(int[] arr) {
        // Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        //자릿수에 맞게 queue에 넣기 1, 10, 100 ...
        for (int i = 0; i < arr.length; i++) {
            int digit = (int) Math.pow(10, 0);
            queueArr[Math.floorDiv(arr[i], digit) % 10].add(arr[i]);
        }

        return new int[10];
    }
    public static void main(String[] args) {
        // 10개 queue생성
        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 20};
        int[] digits = getDigits(arr);
        System.out.println(Arrays.toString(digits));
    }
}
