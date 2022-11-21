package com.likelion.recursive;

public class Factorial {
    public int factorial(int n) {
        if(n == 1) return n;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // 4! = 4 * 3 * 2 * 1 = 24
        var r = new Factorial().factorial(4);
        System.out.println(r);
    }
}
