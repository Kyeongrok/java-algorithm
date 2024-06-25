package com.krk.recursive.codeup1853;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void printStar(int n) {
        if (n == 0) return;
        System.out.printf("*");
        printStar(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        new Main().printStar(n);
    }
}
