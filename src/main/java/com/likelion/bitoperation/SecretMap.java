package com.likelion.bitoperation;

public class SecretMap {
    public String binToSharp(String binaryString) {
        return binaryString.replace("1", "#").replace("0", " ");
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int i = 0;
        String[] answer = new String[n];
        for (int j = 0; j < n; j++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            System.out.println(binaryString);
            answer[i] = binToSharp(binaryString);
        }
        return answer;
    }
    public static void main(String[] args) {
        SecretMap sm = new SecretMap();
        System.out.println("15 & 25 = " + (15 & 25));
        System.out.println("9 | 30 = " + (9 | 30));
        System.out.printf("%s\n", Integer.toBinaryString(9 | 30));
        String r = sm.binToSharp(Integer.toBinaryString(9 | 30));
        System.out.println(r);
    }
}
