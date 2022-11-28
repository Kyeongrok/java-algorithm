package com.likelion.recursive.codeup1852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void printNum(int n, int cnt) {
        if(n < cnt) return;
        System.out.printf("%d ", cnt);
        printNum(n, cnt + 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        printNum(n, 1);
    }
}
