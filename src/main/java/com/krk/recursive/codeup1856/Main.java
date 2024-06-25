package com.krk.recursive.codeup1856;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //1856 : [기초-재귀함수] 계단 뛰어 오르기
    public static int solution(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        else return solution(n - 1) + solution(n - 2) + solution(n - 3);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        int r = solution(n);
        System.out.println(r);
    }
}
