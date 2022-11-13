package com.likelion.prime;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        // 2 ~ 50까지 채우기
        int N = 50;
        var arr = new int[N - 1];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 2;
        System.out.println(Arrays.toString(arr));

        // 2를 제외한 2의 배수 지우기 4부터 idx = 2
        var i = 2;
        for (int j = 2; j < arr.length ; j += i) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));

        i = 3; // 3을 제외한 3의 배수 지우기 6부터 idx = 4
        for (int j = 4; j < arr.length ; j += i) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));

        i = 4; // 4을 제외한 4의 배수 지우기 8부터 idx = 6
        for (int j = 6; j < arr.length ; j += i) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
