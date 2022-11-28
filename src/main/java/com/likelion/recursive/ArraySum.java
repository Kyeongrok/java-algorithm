package com.likelion.recursive;

public class ArraySum {
    static int sum(int[] arr, int idx) {
        if(arr.length == idx) return 0;
        // idx + 1을 해서 탈출조건에 갈수 있게 처리한다
        return arr[idx] + sum(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 9};
        int r = sum(arr, 0);
        // 처음 호출 할 때도 0을 추가로 넣어주어서 복잡해졌다.
        // parameter를 하나 더 추가 해서 더 복잡해졌다.
        System.out.println(r);
    }
}
