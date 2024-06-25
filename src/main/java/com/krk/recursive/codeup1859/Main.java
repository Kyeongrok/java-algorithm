package com.krk.recursive.codeup1859;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String getStars(int n) {
        if(n == 0) return "";
        return "*" + getStars(n - 1);
    }
    public static void printStar(int n) {
        // printStar(1)이 가장 먼저 실행되도록 하려면?
        if(n == 0) return;
        printStar(n - 1);
        System.out.printf(getStars(n));
        System.out.println("");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        printStar(n);
    }
}
