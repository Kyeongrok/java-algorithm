package com.likelion.divisor.codeup2203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
    어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
    예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
    n의 소인수 중에서 가장 큰 수를 구하세요.
     */

    public static void main(String[] args) throws IOException {
        int n = 13195;
        n = 684863094; // 33191
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
//        long n = Long.parseLong(bf.readLine());

        // n 이하의 prime을 구한 후
        // 나누어 떨어지는지 모두 확인
        int divisor = 2;
        while(n != 1){
            if(n % divisor == 0){
                n = n / divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(divisor);
    }
}
