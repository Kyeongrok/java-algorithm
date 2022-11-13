package com.likelion.sort.radix;

import java.util.*;

public class RadixSort4 {
    public int maxDigits(int[] arr) {
        int maxDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = (int) (Math.log10(arr[i]) + 1);
            if(maxDigit < digits) maxDigit = digits;
        }
        return maxDigit;
    }
    public int[] getDigits(int[] arr) {
        Set<Integer> digits = new HashSet<>(); // Set에 넣으면 중복 제거가 됨
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                digits.add(1); // 0은 로그로 자리수를 구할 수 없음
            } else {
                int digit = (int) (Math.log10(arr[i]) + 1);
                digits.add(digit);
            }
        }

        // Set에 넣었던 숫자들을 Array로
        var answer = new int[digits.size()];
        int idx = 0;
        for (Integer digit : digits) {
            answer[idx++] = digit;
        }

        // Set은 순서를 보장하지 않기 때문에 return하기 전에 정렬
        Arrays.sort(answer);
        return answer;
    }

    public int[] sortByDigit(int digit, int[] arr) {

        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }
        // 일의 자리가 맞는 곳에 넣는다
        for (var i : arr) {
            int diviser = (int)Math.pow(10, digit - 1);
            queueArr[Math.floorDiv(i, diviser) % 10].add(i); // i % 10해서 일의 자리를 구함
        }

        // 꺼내서 arr에 다시 넣는다
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 223, 8715, 9002, 16, 7, 0, 14};
        RadixSort4 rs = new RadixSort4();
        var digits = rs.getDigits(arr);
        System.out.println(Arrays.toString(digits));
        for (var digit : digits) {
            arr = rs.sortByDigit(digit, arr);
            System.out.println(Arrays.toString(arr));
        }

    }
}
