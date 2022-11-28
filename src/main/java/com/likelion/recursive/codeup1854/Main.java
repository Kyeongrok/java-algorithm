package com.likelion.recursive.codeup1854;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long sum(long n) {
        if(n == 0) return n;
        return n % 10 + sum(n / 10);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        Long n = Long.parseLong(bf.readLine());
        long r = sum(n);
        System.out.println(r);
    }
}
