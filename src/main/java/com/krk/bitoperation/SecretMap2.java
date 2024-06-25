package com.krk.bitoperation;

public class SecretMap2 {
    public String binToSharp(String binaryString) {
        return binaryString.replace("1", "#").replace("0", " ");
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            binaryString = " ".repeat(n - binaryString.length()) + binaryString;
            answer[i] = binToSharp(binaryString);
        }
        return answer;
    }
    public static void main(String[] args) {
        SecretMap2 sm = new SecretMap2();
        sm.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}
