package com.likelion.recursive;

public class Fibonacci3 {
    public static int fib(int n) {
        if(n == 1 | n == 2 ) return 1; // 1일때 1 2일때 1
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int r = fib(6);
        System.out.println(r);
    }
}
