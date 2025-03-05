package com.krk.gcd;

public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 192;

        // a, b의 최대 공약수는
        if (a >= b) {
            int r = a % b;
        } else {
            int r = b % a;
        }
        // r과 b의 최대공약수와 a와 b의 최대공약수는 같다는 알고리즘 입니다.
    }
}
