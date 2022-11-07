package com.likelion.remainder.test;

public class Harshad2 {
    public boolean solution2(int x) {
        // x를 string으로 바꾼 후
        String n = String.valueOf(x);
        for (int i = 0; i < n.length(); i++) {
            n.charAt(i);
        }

        return false;
    }
    public boolean solution(int x) {

        int originX = x;
        // 자릿수 합
        int sumOfDigit = 0;
        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        // 자릿수 합으로 나누어 떨어 지는지
        return originX % sumOfDigit == 0;
    }

    public static void main(String[] args) {
        Harshad2 harshad2 = new Harshad2();
        harshad2.solution(687);
    }
}
