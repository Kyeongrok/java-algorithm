package com.krk.remainder;

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 687;
        int originX = x;

        // 자릿수의 합 구하기
        int sumOfDigit = 0;
        while(x > 0){
            sumOfDigit += x % 10;
            x = x / 10;
        }
        // 나누어 떨어지는지 check하기
        boolean answer = originX % sumOfDigit == 0;
        System.out.println(answer);
    }
}
