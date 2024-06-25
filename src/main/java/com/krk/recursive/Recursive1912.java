package com.krk.recursive;

public class Recursive1912 {
    public static int factorial(int num) {
        if(num == 1) return num; // 1일때 1을 리턴함
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
