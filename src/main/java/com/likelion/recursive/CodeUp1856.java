package com.likelion.recursive;

public class CodeUp1856 {
    public static int solution(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        else return solution(n - 1) + solution(n - 2) + solution(n - 3);
    }
    public static void main(String[] args) {
        int r = solution(4);
        System.out.println(r);
    }
}
