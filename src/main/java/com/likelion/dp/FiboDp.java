package com.likelion.dp;

public class FiboDp {
    int[] memo = new int[100];

    public static int fib(int n, int[] lookup) {
        if (n <= 1) return n;
        if (lookup[n] == 0) lookup[n] = fib(n-2, lookup) + fib(n-1, lookup);
        // 1 1 2 3 5
        return lookup[n];
    }

    public static int fibRecur(int n) {
        if (n <= 1) return n;
        return fibRecur(n - 1) + fibRecur(n - 2);
    }
    public static void main(String[] args) {
        var r = fib(40, new int[70 + 1]);
        System.out.println(r);
//        System.out.println(fibRecur(45));
    }
}
