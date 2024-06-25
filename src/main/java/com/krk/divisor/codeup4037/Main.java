package com.krk.divisor.codeup4037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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
    public static void printPrimeFactors(int n) {
        int[] primesOfUnderN = sieve(n);
        int sieveIdx = 0;
        int divisor = primesOfUnderN[sieveIdx];
//        Map<Integer, Integer> answer = new HashMap<>();
        while(n != 1){
//            System.out.println(sieveIdx);
            if(primesOfUnderN[n - 2] != 0){
                System.out.printf("%d", n);
                break;
            } else if(n % divisor == 0){
//                System.out.println(divisor);
//                answer.put(divisor, answer.getOrDefault(divisor, 0) + 1);
                n = n / divisor;
            } else{
                // 단순히 올리면 안됨.. 0이 아닐때까지
                do{
                    sieveIdx++;
                } while(primesOfUnderN[sieveIdx] != 0);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        printPrimeFactors(n);
    }
}
