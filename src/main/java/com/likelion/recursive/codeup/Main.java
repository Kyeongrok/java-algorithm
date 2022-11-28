package com.likelion.recursive.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int sum(int n) {
        if (n == 0) return n;
        return n + sum(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        int r = new Main().sum(n);
        System.out.println(r);
    }
}
