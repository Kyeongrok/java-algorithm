package com.krk.prime.test;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1]; // idx는 0~48 숫자는 2~50
        for (int i = 0; i < arr.length; i++) arr[i] = i + 2; // 2 ~ 50까지 값 채우기

        //2를 제외한 2의 배수를 0으로 만들기
        for (int i = 0; i * i <= N ; i++) {
            System.out.println("i:" + i);
            if (arr[i] != 0) {
                for (int j = i * 2 + 2; j < arr.length; j += arr[i]) { // arr.length = 49이므로 49미만까지
                    System.out.println(j);
                    arr[j] = 0;
                }
            }
        }

        System.out.printf("%d %d\n", 2, arr[2]);
        System.out.printf("%d %d\n", 4, arr[4]);
        System.out.printf("%d %d\n", 5, arr[5]);
        System.out.printf("%d %d\n", 7, arr[7]); // 7번 idx가 9 이므로 0이 나와야 함
        System.out.printf("%d %d\n", 47, arr[47]);
        System.out.printf("%d %d\n", 48, arr[48]);
    }
}
