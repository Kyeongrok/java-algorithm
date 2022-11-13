package com.likelion.prime;

import java.util.Arrays;

public class SieveOfEratosthenes2 {
    public static void main(String[] args) {
        // 2 ~ 50까지 채우기
        int N = 50;
        var arr = new int[N - 1];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 2;
        System.out.println(Arrays.toString(arr));
        // i 0 1 2 3 ... n   (n * 2) + 2
        //   2 4 6 8
        for (int i = 0; i * i < N; i++) {
            if (arr[i] !=0 ){
                System.out.println(i);
                for (int j = i * 2 + 2; j < arr.length ; j += arr[i]) {
                    arr[j] = 0;
                }
                System.out.println(Arrays.toString(arr));
            }
        }

        // 0이 아닌 값들만 출력
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) if(arr[i] != 0) {
            System.out.printf("%d|", arr[i]);
            cnt ++;
        }
        System.out.println();
        System.out.println(cnt);
    }
}
