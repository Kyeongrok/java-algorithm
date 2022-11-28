package com.likelion.recursive;

public class GCD {
    public static int solution(int a, int b) {
        if(a == b) {
            return a;
        } else if (a > b) {
            return solution(a - b, b);
        } else if (a < b) {
            return solution(a, b - a);
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(solution(196, 42));
    }
}
