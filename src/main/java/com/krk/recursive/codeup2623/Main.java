package com.krk.recursive.codeup2623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int gcd(int a, int b) {
        if(a > b) return gcd(a - b, b); // 196, 42
        else if (a < b) return gcd(a, b - a); // 28, 42
        else if (a == b) return a;
        return 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String[] n = bf.readLine().split(" ");
        System.out.println(gcd(Integer.parseInt(n[0]), Integer.parseInt(n[1])));
    }
}
