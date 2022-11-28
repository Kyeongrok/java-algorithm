package com.likelion.recursive.codeup1860;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String getNums(int n) {
        if(n == 1) return "1";
        return getNums(n - 1) + " " + n;
    }
    public static void printNum(int n) {
        // printStar(1)이 가장 먼저 실행되도록 하려면?
        if(n == 0) return;
        printNum(n - 1);
        System.out.printf(getNums(n));
        System.out.println("");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        printNum(n);
    }
}
