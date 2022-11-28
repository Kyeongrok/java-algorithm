package com.likelion.recursive.codeup1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1904 : (재귀함수) 두 수 사이의 홀수 출력하기
public class Main {
    public static void printNum(int a, int b) {
        if(a > b) return;
        printNum(a, b - 1);
        if(b % 2 != 0) System.out.printf("%d ", b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String[] n = bf.readLine().split(" ");
        printNum(Integer.parseInt(n[0]), Integer.parseInt(n[1]));
    }
}
