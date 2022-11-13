package com.likelion.bitoperation;

import java.util.Arrays;

public class DecimalToBinary2 {
    String[] solution(int n, int[] arr1, int[] arr2) {
        var answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            // 자릿수 맞춰주는 연산
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        DecimalToBinary2 dtb = new DecimalToBinary2();
        var arr1 = new int[]{9, 20, 28, 18, 11};
        var arr2 = new int[]{30, 1, 21, 17, 28};
        var r = dtb.solution(5, arr1, arr2);
        System.out.println(Arrays.toString(r));
    }
}
