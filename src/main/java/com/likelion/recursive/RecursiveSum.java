package com.likelion.recursive;

public class RecursiveSum {
    public int sum(int[] arr, int answer, int idx) {
        if(idx == arr.length) return answer;
        return sum(arr, answer + arr[idx], idx + 1);
    }

    public static void main(String[] args) {
        var r = new RecursiveSum().sum(new int[]{7, 3, 2, 9}, 0, 0);
        System.out.println(r);
    }
}
