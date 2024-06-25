package com.krk.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1284 {
    public static int[] sieve(int N) {
        int[] nums = new int[N + 1];
        boolean[] dpIsPrime = new boolean[N + 1];

        // 숫자로 초기화, true로 초기화
        for (int i = 0; i < N; i++) {
            nums[i] = i;
            dpIsPrime[i] = true;
        }

        dpIsPrime[0] = false;
        dpIsPrime[1] = false;

        // 2부터 sqrt(N) 이하까지 반복
        for (int j = 2; j * j <= N; j++) {
            int step = nums[j];
            if(dpIsPrime[j]) {
//                System.out.println(step);
                /*
                2 3 4 5 6
                4 6 8 10 12
                 */
                for (int i = step * 2; i < dpIsPrime.length; i += step) {
                    dpIsPrime[i] = false;
                }
            }
        }

        // 소수 개수 세기
        int cntPrimes = 0;
        for (int i = 1; i < dpIsPrime.length; i++) {
            if(dpIsPrime[i]){
                cntPrimes++;
//                System.out.printf("%d ", nums[i]);
            }
        }

//        System.out.println(cntPrimes);
        int[] primes = new int[cntPrimes];

        int idx = 0;
        for (int i = 2; i < dpIsPrime.length; i++) {
            if(dpIsPrime[i]) primes[idx++] = nums[i];
        }

        return primes;
        }
    public static void main(String[] args) {
        // 10,000,000 이하의 소수를 모두 구한다.
        int N = 6;
        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
        int[] primes = sieve(N);
        // 소수로 나누어본다.
        boolean found = false;
        for (int i = 0; i < primes.length; i++) {
            if (N % primes[i] == 0) {
                // 나누어 떨어지면 몫이 소수인지도 확인한다.
                int quotient = N / primes[i];
                int index = Arrays.binarySearch(primes, quotient);
                if (index > 0) {
                    System.out.printf("%d %d\n", primes[i], quotient);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            // 나누어 떨어지지 않으면 wrong number를 출력한다.
            System.out.println("wrong number");
        }
    }
}
