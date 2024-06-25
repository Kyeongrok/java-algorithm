package com.krk.divisor;

import java.util.HashMap;
import java.util.Map;

public class Factorization {

    public static void primeFactor1() {
        int i = 29;
        int divisor = 2;
        Map<Integer, Integer> answer = new HashMap<>();
        while (i != 1) {
            System.out.println(i);
            if(i % divisor == 0){
                i = i / divisor;
                answer.put(divisor, answer.getOrDefault(divisor, 0) + 1);
            } else {
                divisor ++;
            }
        }
        System.out.println(answer);
        answer.forEach((integer, integer2) -> System.out.printf("%d %d\n", integer, integer2));
    }

    public static void findPrimeFactor(int n) {
        for(int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                findPrimeFactor(n / i);
                break;
            }
        }
    }

    public static int[] sieve(int n) {
        int[] arr = new int[n-1];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 2;

        int idx = 0;
        while (idx * idx <= n){ // 0:2 9
            if (arr[idx] !=0 ) {
                for (int i = idx * 2 + 2; i < arr.length; i += arr[idx]) {
                    arr[i] = 0;
                }
            }
            idx++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 72;
        int divisor = 2;
        int[] primesOfUnderN = sieve(n);
        Map<Integer, Integer> answer = new HashMap<>();
        while(n != 1){
            if(primesOfUnderN[n - 2] != 0){
                System.out.printf("%d", n);
                break;
            } else if(n % divisor == 0){
                System.out.println(divisor);
                answer.put(divisor, answer.getOrDefault(divisor, 0) + 1);
                n = n / divisor;
            } else{
                divisor++;
            }
        }
//        answer.forEach((a, b)-> System.out.printf("%d %d\n", a, b));
    }


}
